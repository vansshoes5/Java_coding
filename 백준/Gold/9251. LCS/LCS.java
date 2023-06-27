import java.io.*;
import java.util.*;

public class Main {
	
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//int N = Integer.parseInt(bf.readLine());
		//StringTokenizer stk = new StringTokenizer(bf.readLine(), " ");
		
		String neko = bf.readLine();
		String nike = bf.readLine();
		
		
		int[][] dp = new int[1001][1001];
		
		int result = 0;
		
		
		
		for(int i=0;i<=neko.length();i++) {
			for(int j=0;j<=nike.length();j++) {
				if(i==0 || j==0) {
					dp[i][j] = 0;
				}
				else if(neko.charAt(i-1)==nike.charAt(j-1)) {
					
					//System.out.print(neko.charAt(i-1)+", "+nike.charAt(j-1)+" ");
					
					dp[i][j] = dp[i-1][j-1]+1;
				}
				else {
					//System.out.print(neko.charAt(i-1)+", "+nike.charAt(j-1)+" ");
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
				//System.out.println(i+", "+j+" : "+dp[i][j]);
				result = Math.max(result, dp[i][j]);
			}
		}
		
		System.out.println(result);
	}

}
