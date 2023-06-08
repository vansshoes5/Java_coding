import java.io.*;
import java.util.*;

public class Main {
	
	static int stair[];
	static int dp[];

	
	private static int search(int N) {
		
		for(int i=4;i<=N;i++) {
			dp[i] = Math.max(dp[i-1], Math.max(dp[i-2], dp[i-3]+stair[i-1])+stair[i]);
			//System.out.println(i+": "+dp[i]);
			//max = Math.max(max, dp[i]);
		}
		
		
		return dp[N];
	}
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		//StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(bf.readLine());
		
		stair = new int[10001];
		dp = new int[10001];
		
		for(int i=1;i<=N;i++) {
			stair[i] = Integer.parseInt(bf.readLine());
		}
		int result = 0;
		dp[1] = stair[1];
		dp[2] = stair[1]+stair[2];
		dp[3] = Math.max(dp[2], Math.max(stair[1], stair[2])+stair[3]);
		if(N>3) {
			result = search(N);
		}else {
			result = dp[N];
		}
		
		System.out.println(result);
		
		
	}

}
