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
	
	
	
	private static int multiply(int[][] matrix) {
		
		int n = matrix.length;
		
		int[][] dp = new int[n][n];
		
		for(int i=0;i<n-1;i++) {
			dp[i][i+1] = matrix[i][0]*matrix[i][1]*matrix[i+1][1];
			//System.out.println(dp[i][i+1]);
		}
		
		for(int i=1;i<n;i++) {
			for(int j=0;j+i<n;j++) {
				for(int k=j;k<i+j;k++) {
					
					int t = matrix[j][0]*matrix[k][1]*matrix[j+i][1];
					
					if(dp[j][i+j]==0) {
						dp[j][i+j] = dp[j][k]+dp[k+1][i+j]+t;
					}else {
						dp[j][i+j] = Math.min(dp[j][i+j], dp[j][k]+dp[k+1][i+j]+t);
					}
					
				}
			}
		}
		
		
		
		/*for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}*/
		
		return dp[0][n-1];
		
	}
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(bf.readLine());
		int[][] matrix = new int[n][2];
		
		for(int i=0;i<n;i++) {
			StringTokenizer stk = new StringTokenizer(bf.readLine());
			matrix[i][0] = Integer.parseInt(stk.nextToken());
			matrix[i][1] = Integer.parseInt(stk.nextToken());
		}
		
		int result = multiply(matrix);
		
		
		System.out.println(result);
		
	}

}
