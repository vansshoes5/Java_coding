import java.io.*;
import java.util.*;

public class Main {
	
	static int[][] triangle;
	static int dp[][];

	static int max =0;
	
	private static int search(int N) {
		
		//dp[1][0] = dp[0][0] + triangle[1][0];
		//dp[1][1] = dp[0][0] + triangle[1][1];
		
		for(int i=1;i<N;i++) {
			for(int j=0;j<=i;j++) {
				 if(j==0) {
					 dp[i][j] = dp[i-1][j]+triangle[i][j];
				 }else if(j==i) {
					 dp[i][j] = dp[i-1][j-1]+triangle[i][j];
				 }
				 else {
					 dp[i][j] = Math.max(dp[i-1][j-1]+triangle[i][j], dp[i-1][j]+triangle[i][j]);
				 }
				// System.out.println(i+","+j+" :"+dp[i][j]);
			}
			
		}
		for(int i=0;i<N;i++) {
			max = Math.max(max, dp[N-1][i]); 
		}
		
		return max;
	}
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		//StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(bf.readLine());
		triangle = new int[N][N];
		dp = new int[N][N];
		
		for(int i=0;i<N;i++) {
			stk = new StringTokenizer(bf.readLine(), " ");
			for(int j=0;j<=i;j++) {
				triangle[i][j] = Integer.parseInt(stk.nextToken());
			}
		}
		
		dp[0][0] = triangle[0][0];
		int result;
		if(N==1) {
			result = dp[0][0];
		}
		result = search(N);
		System.out.println(result);
		
		
	}

}
