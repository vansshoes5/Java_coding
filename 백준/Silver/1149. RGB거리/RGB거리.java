import java.io.*;
import java.util.*;

public class Main {
	
	static int[][] rgb;
	static int dp[][];

	static int min =Integer.MAX_VALUE;
	
	private static int search(int N) {
		
		//dp[1][0] = dp[0][0] + triangle[1][0];
		//dp[1][1] = dp[0][0] + triangle[1][1];
		
		for(int i=1;i<N;i++) {
			for(int j=0;j<3;j++) {
				//System.out.println("j: "+j);
				if(j==0) {
					dp[i][j] = Math.min(dp[i-1][1]+rgb[i][j], dp[i-1][2]+rgb[i][j]);
				}else if(j==1) {
					dp[i][j] = Math.min(dp[i-1][0]+rgb[i][j], dp[i-1][2]+rgb[i][j]);
				}else if(j==2){
					dp[i][j] = Math.min(dp[i-1][0]+rgb[i][j], dp[i-1][1]+rgb[i][j]);
				}
				//System.out.println(i+", "+j+" : "+dp[i][j]);
			}
		}
		for(int i=0;i<3;i++) {
			min = Math.min(dp[N-1][i], min);
		}
		
		return min;
	}
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		//StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(bf.readLine());
		rgb = new int[N][3];
		dp = new int[N][3];
		
		for(int i=0;i<N;i++) {
			stk = new StringTokenizer(bf.readLine(), " ");
			for(int j=0;j<3;j++) {
				rgb[i][j] = Integer.parseInt(stk.nextToken());
			}
		}
		for(int i=0;i<3;i++) {
			dp[0][i] = rgb[0][i];
			//System.out.println(dp[0][i]);
		}
		
		int result;
		
		result = search(N);
		System.out.println(result);
		
		
	}

}
