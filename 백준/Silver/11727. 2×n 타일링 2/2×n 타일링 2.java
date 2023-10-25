import java.io.*;
import java.util.*;

/*
 *  지도!
 *  
 *  n, down = 세로
 *  m, right = 가로
 *  
 *  x, y
 *  -1, 0 -> 왼쪽으로 한 칸
 *  1, 0 -> 오른쪽으로 한 칸
 *  0, -1 -> 위로 한 칸
 *  0, 1 -> 아래로 한 칸
 *  
 * */

public class Main {
	
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(bf.readLine());
		int dp[] = new int[1001];
		
		dp[1] = 1;
		dp[2] = 3;
		for(int i=3;i<=n;i++) {
			
			dp[i] = dp[i-1]+(dp[i-2]*2);
			dp[i] %= 10007;
		}
		
		System.out.println(dp[n]);
		
	}

}
