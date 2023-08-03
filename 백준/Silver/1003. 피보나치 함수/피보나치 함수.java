import java.io.*;
import java.util.*;
import java.math.*;



public class Main {
	
	static int[][] dp;
	
	private static void fibo(int n) {
		
		for(int i=2;i<=n;i++) {
			dp[i][0] = dp[i-1][0]+dp[i-2][0];
			dp[i][1] = dp[i-1][1]+dp[i-2][1];
		}
		
	}
	
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int Test = Integer.parseInt(bf.readLine());
		dp = new int[41][41];
		
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		for(int i=0;i<Test;i++) {
			//zero=0;
			//one=0;
			
			int n = Integer.parseInt(bf.readLine());
			fibo(n);
			System.out.println(dp[n][0] + " "+dp[n][1]);
			//System.out.println(zero + " "+one);
		}
		
	}

}
