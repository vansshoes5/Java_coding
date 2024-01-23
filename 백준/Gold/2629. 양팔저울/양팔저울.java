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
	
	static int n=0;
	static boolean[] dp = new boolean[40001];
	
	
	
	
	private static void scale(int[] arr, int total) {
		
		for(int i=0;i<n;i++) {
			//dp[arr[i]] = true;
			for(int j=total;j>=0;j--) {
				
				if(dp[j]) {
					//System.out.println("j: "+j);
					dp[j+arr[i]] = true;
				}
			}
			for(int j=0;j<=total;j++) {
				if(dp[j]) {
					//System.out.println("j: "+j);
					dp[Math.abs(j-arr[i])] = true;
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		
		//System.out.print("input tc: ");
		
		n = Integer.parseInt(bf.readLine());
		int[] steel = new int[31];
		
		int total=0;
		
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		for(int i=0;i<n;i++) {
			steel[i] = Integer.parseInt(stk.nextToken());
			total += steel[i];
		}
		
		dp[0] = true;
		scale(steel, total);
		
		
		int k = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		stk = new StringTokenizer(bf.readLine());
		for(int i=0;i<k;i++) {
			int e = Integer.parseInt(stk.nextToken());
			if(dp[e]) {
				sb.append("Y ");
			}else {
				sb.append("N ");
			}
		}
		
		
		/*StringBuilder sb = new StringBuilder();
		int pearl = Integer.parseInt(bf.readLine());
		stk = new StringTokenizer(bf.readLine());
		for(int i=0;i<pearl;i++) {
			int temp = Integer.parseInt(stk.nextToken());
			if(check[temp]!=0) {
				sb.append("Y ");
			}
			else {
				sb.append("N ");
			}
		}
		*/
		System.out.println(sb);
		
		
		
	}

}
