import java.io.*;
import java.util.*;

/*
 *  SWEA
 *  
 *  
 *  
 *  
 *  
 * */

public class Main {
	
	static int n;
	static int[][] sticker;
	static int[][] dp;
	static boolean flag = true;
	
	private static void function() {
		for(int i=2;i<=n;i++) {
			dp[1][i] = Math.max(dp[2][i-1], dp[2][i-2])+sticker[1][i];
			dp[2][i]= Math.max(dp[1][i-1], dp[1][i-2])+sticker[2][i];
		}
    }
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(bf.readLine());
		StringTokenizer line1;
		StringTokenizer line2;
		
		for(int i=0;i<tc;i++) {
			n = Integer.parseInt(bf.readLine());
			sticker = new int[3][n+1];
			dp = new int[3][n+1];
			line1 = new StringTokenizer(bf.readLine());
			line2 = new StringTokenizer(bf.readLine());
			for(int j=1;j<=n;j++) {
				sticker[1][j] = Integer.parseInt(line1.nextToken());
				sticker[2][j] = Integer.parseInt(line2.nextToken());
			}
			dp[1][1] = sticker[1][1];
			dp[2][1] = sticker[2][1];
			
			if(n>1)	function();
			int result = Math.max(dp[1][n], dp[2][n]);
			System.out.println(result);
		}
	}
}