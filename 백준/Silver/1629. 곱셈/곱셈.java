import java.io.*;
import java.util.*;



public class Main {
	
	
	
	//static int counter=0;
	
	private static long power(long a, long b, long c) {
		
		if(b==1) {
			return a%c;
		}else {
			long temp = power(a, b/2, c);
			if(b%2==0) {
				//System.out.println("========");
				//System.out.println(temp*temp);
				return (temp*temp)%c;
			}else {
				//System.out.println("========");
				//System.out.println(temp*temp*a);
				return ((temp*temp % c)*a)%c;
			}
		}
		
		
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk  = new StringTokenizer(bf.readLine());
		
		long A = Long.parseLong(stk.nextToken());
		long B = Long.parseLong(stk.nextToken());
		long C = Long.parseLong(stk.nextToken());
		
		System.out.println(power(A, B, C));
		
		/*long result = 1;
		while(B>0) {
			if(B%2==1) {
				result = result*A;
			}
			A *= A;
			B /=2;
		}*/
		//System.out.println(result%C);
		
		
	}

}
