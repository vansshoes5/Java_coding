import java.io.*;
import java.util.*;

public class Main {
	
	
	

	
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		StringTokenizer stk = new StringTokenizer(bf.readLine(), " ");
		
		int[] arr = new int[N];
		int[] dp2 = new int[N];
		int[] dp = new int[N];
		int[] last_dp = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		
		dp[0] = 1;
		int max = 0;
		//int min = 0;
		
		for(int i=1;i<N;i++) {
			dp[i] = 1;
			for(int j=0;j<i;j++) {
				if(arr[j] < arr[i] &&dp[i] < dp[j]+1) {
					dp[i] = dp[j]+1;
				}
			}
			//System.out.println(i+" : "+dp[i]);
			//max = Math.max(max, dp[i]);
		}
		//System.out.println("=======================");
		for(int i=N-1;i>=0;i--) {
			dp2[i] = 1;
			for(int j=N-1;j>i;j--) {
				if(arr[j] < arr[i] && dp2[i] < dp2[j]+1) {
					dp2[i] = dp2[j]+1;
				}
			}
			//System.out.println(i+" : "+dp2[i]);
			
		}
		for(int i=0;i<N;i++) {
			//System.out.println(i+" : "+dp[i]+"+"+dp2[i]+"-1 = "+(dp[i]+dp2[i]-1));
			last_dp[i] = dp[i]+dp2[i]-1;
			max = Math.max(max, last_dp[i]);
		}
		
		
		
		
		
		System.out.println(/*"max : "+*/max);
		
	}

}
