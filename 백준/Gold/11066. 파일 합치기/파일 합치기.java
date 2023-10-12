import java.io.*;
import java.util.*;
import java.lang.*;

/*
 *  파일합치기
 *  
 *  1차원 dp로 해결 힘듦.
 *  
 * */

public class Main {
	
	//static int k;
	static int[][] dp;
	static int[] file;
	static int[] sum;
	
	private static int cost(int n) {
		
		dp = new int[n][n];
		
		for(int i=0;i<n-1;i++) {
			dp[i][i+1] = file[i]+file[i+1];
		}
		//int result = 0;
		//dp[1][1] = file[1];
		/*
		 * i : 구하고자 하는 dp 범위
		 * 		if n==4, 
		 * 			가용범위는 1~n
		 * 
		 * j : 범위의 시작점
		 * 		if n==4
		 * 			가능한 시작점은 1~n-1
		 * k : 구간 나누기
		 * 		if n==4
		 * 	 	나눌 수 있는 구간은 j ~ j+i
		 * */
		for(int i=2;i<n;i++) {
			for(int j=0;i+j<n;j++) {
				for(int k=j;k<i+j;k++) {
					//System.out.println(i+", "+j);
					int distance = j==0 ? sum[i+j] : sum[i+j]-sum[j-1];
					//System.out.println("distance : "+distance);
					if(dp[j][i+j]==0) {
						dp[j][i+j] = (dp[j][k]+dp[k+1][i+j]+distance);
					}else {
						dp[j][i+j] = Math.min(dp[j][i+j], (dp[j][k]+dp[k+1][i+j]+distance));
					}
					//System.out.println(i+" , "+j+" : "+dp[j][i+j]);
				}
				
			}
		}
		
		
		return dp[0][n-1];
		
		
	}
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(bf.readLine());
		
		
		
		for(int i=0;i<n;i++) {
			int k = Integer.parseInt(bf.readLine());
			StringTokenizer stk = new StringTokenizer(bf.readLine());
			
			
			file = new int[k];
			sum = new int[k];
			for(int j=0;j<k;j++) {
				file[j] = Integer.parseInt(stk.nextToken());
			}
			sum[0] = file[0];
			
			for(int j=1;j<k;j++) {
				sum[j] = sum[j-1]+file[j];
			}
			
			sb.append(cost(k)).append("\n");
			//System.out.println(cost(k));
		}
		System.out.println(sb);
		
		
	}

}
