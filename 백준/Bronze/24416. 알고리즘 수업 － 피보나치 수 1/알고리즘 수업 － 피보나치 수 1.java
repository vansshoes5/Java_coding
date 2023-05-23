import java.io.*;
import java.util.*;

public class Main {
	
	static int fibo_count = 0;
	static int dynamic_count =0 ;
	
	private static int fibo(int n) {
		if(n==1 || n==2) {
			fibo_count++;
			return 1;
		}
		else {
			return (fibo(n-1)+fibo(n-2));
		}
	}
	
	private static int dynamic_fibo(int n) {
		int[] dn = new int[n+1];
		dn[1] = dn[2] = 1;
		for(int i=3;i<dn.length;i++) {
			dn[i] = dn[i-1]+dn[i-2];
			dynamic_count++;
		}
		return dn[n];
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		fibo(num);
		dynamic_fibo(num);
		System.out.println(fibo_count+" "+dynamic_count);
	}

}
