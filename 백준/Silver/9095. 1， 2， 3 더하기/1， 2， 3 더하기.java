import java.io.*;
import java.util.*;



public class Main {
	
	
	
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//StringTokenizer stk  = new StringTokenizer(bf.readLine());
		int T = Integer.parseInt(bf.readLine());
		int[] dp = new int[12];
        
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for(int i=4;i<=11;i++) {
			dp[i] = dp[i-3]+dp[i-2]+dp[i-1];
		}
		
		for(int i=0;i<T;i++) {
			int n =Integer.parseInt(bf.readLine()); 
			//int result = adding(n);
			
			sb.append(dp[n]).append("\n");
			
		}
		
		System.out.println(sb);
	}

}
