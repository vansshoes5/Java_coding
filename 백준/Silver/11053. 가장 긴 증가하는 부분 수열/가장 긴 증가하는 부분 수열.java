import java.io.*;
import java.util.*;

public class Main {
	
	static int arr[];
	static int dp[];
	

	
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		StringTokenizer stk = new StringTokenizer(bf.readLine(), " ");
		
		arr = new int[N];
		dp = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		
		dp[0] = 1;
		int result = 0;
		
		for(int i=1;i<N;i++) {
			dp[i] = 1;
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i] && dp[i] < dp[j]+1) {
					//System.out.println(arr[j] +", "+arr[i]);
					dp[i] = dp[j]+1;
					//System.out.println("Max : " +anti_max);
				}
			}
			//System.out.println("dp "+(i+1)+" : "+dp[i]);
			//result = Math.max(result, dp[i]);
		}
		
		for(int i=0;i<N;i++) {
			if(result<dp[i]) {
				result = dp[i];
			}
		}
		
		
		System.out.println(result);
		
	}

}
