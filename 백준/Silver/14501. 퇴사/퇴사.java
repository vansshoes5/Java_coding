import java.io.*;
import java.util.*;

/*
 *  
 *  
 *  
 * */

public class Main {
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(bf.readLine());
		int[][] schedule = new int[15][2];
		
		for(int i=0;i<n;i++) {
			StringTokenizer stk = new StringTokenizer(bf.readLine());
			schedule[i][0] = Integer.parseInt(stk.nextToken());
			schedule[i][1] = Integer.parseInt(stk.nextToken());
		}
		
		//int take=0;
		int dp[] = new int[n+1];
		
		for(int i=0;i<n;i++) {
			for(int j=i+schedule[i][0];j<=n;j++) {
				
				dp[j] = Math.max(dp[j], dp[i]+schedule[i][1]);
				
			}
		}
		/*for(int i=1;i<=n;i++) {
			System.out.println(i+" : "+dp[i]);
		}*/
		
		System.out.println(dp[n]);
		
	}

}
