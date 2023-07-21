import java.io.*;
import java.util.*;



public class Main {
	
	static long mod = 1000000007;
	
	private static long module(long n, long r) {
		/*if(r ==1) {
			return n%mod;
		}
		long number = module(n, r/2);*/
		
		long result = 1;
		//long T = mod-2;
		//System.out.println("B-p : "+result);
		//System.out.println("T : "+T);
		while(r>0) {
			
			if(r%2==1) {
				result *= n;
				result %= mod;
				//System.out.println("re : "+result);
			}
			
			n *= n;
			n %= mod;
			r /= 2;
			//System.out.println("n : "+n);
		}
		
		return result;
		
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk  = new StringTokenizer(bf.readLine());
		
		//n
		int N = Integer.parseInt(stk.nextToken());
		
		//r
		int K = Integer.parseInt(stk.nextToken());
		
		// nCr = n! / (r! (n-r)!) % mod
		// => n! * (r! (n-r)!)*(mod-2)  % mod
		
		// n!
		long A=1;
		for(int i=2;i<=N;i++) {
			A = A*i;
			A = A%mod;
		}
		//System.out.println("n! :" +A);
		
		// r! * (n-r)!  #step1
		long B=1;
		for(int i=2;i<=K;i++) {
			B = B*i;
			B = B%mod;
		}
		//System.out.println("k! : "+B);
		
		//r! * (n-r)!  #step2
		for(int i=1;i<=(N-K);i++) {
			B *= i;
			B %= mod;
		}
		//System.out.println("n!(n-r)! : "+B);
		/*
		// B * (mod-2);
		long B_p = 1;
		long T = mod-2;
		System.out.println("B-p : "+B_p);
		//System.out.println("T : "+T);
		while(T>0) {
			if(T % 2==1) {
				B_p = B_p * B;
				B_p %= mod;
				//System.out.println("B-p : "+B_p);
			}
			//System.out.println("=======");
			B = B* B;
			B %= mod;
			T /= 2;
			//System.out.println("B : "+B);
			//System.out.println("=======");
			
		}*/
		long result = A * module(B, mod-2);
		result %= mod;
		
		System.out.println(result);
	}

}
