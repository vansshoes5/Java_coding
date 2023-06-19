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
		
		dp[0] = arr[0];
		int result = 0;
		
		for(int i=1;i<N;i++) {
			dp[i] = arr[i];
			int max = 0;
			for(int j=0;j<i;j++) {
				
				if(arr[j] < arr[i] ) {
					//System.out.println(arr[j] +", "+arr[i]);
					max = Math.max(max, dp[j]);
					
					//System.out.println("dp "+i+": " +dp[i]);
				}
				//System.out.println("max : "+max);
				
			}
			dp[i] = dp[i]+max;
			//System.out.println("dp "+i+" : "+dp[i]);
			//System.out.println("dp "+i+": " +dp[i]);
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
