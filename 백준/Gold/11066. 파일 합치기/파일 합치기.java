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
	
	
	
	private static int cost(int[] file, int[] sum) {
		int n = file.length;
		int[][] dp = new int[n][n];
		
		for(int i=0;i<n-1;i++) {
			dp[i][i+1] = file[i]+file[i+1];
		}
		
		for(int i=2;i<n;i++) {
			for(int j=0;j+i<n;j++) {
				for(int k=j;k<i+j;k++) {
					
					int distance = j==0 ? sum[i+j] : sum[i+j]-sum[j-1];
					
					if(dp[j][i+j]==0) {
						dp[j][j+i] = dp[j][k]+dp[k+1][i+j]+distance; 
					}else {
						dp[j][j+i] = Math.min(dp[j][j+i], dp[j][k]+dp[k+1][i+j]+distance);
					}
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
		
		int test = Integer.parseInt(bf.readLine());
		
		for(int i=0;i<test;i++) {
			int k = Integer.parseInt(bf.readLine());
			StringTokenizer stk = new StringTokenizer(bf.readLine());
			
			int[] file = new int[k];
			for(int j=0;j<k;j++) {
				file[j] = Integer.parseInt(stk.nextToken());
			}
			
			int[] sum = new int[k];
			sum[0] = file[0];
			for(int j=1;j<k;j++) {
				sum[j] = sum[j-1]+file[j];
			}
			
			int result = cost(file, sum);
			//System.out.println(result);
			sb.append(result).append("\n");
		}
		System.out.println(sb);
		
	}

}
