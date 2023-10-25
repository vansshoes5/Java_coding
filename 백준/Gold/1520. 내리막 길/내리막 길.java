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
	
	static int[][] dp;
	static int[][] map;
	static int count=0;
	static int n, m;
	
	// 좌표를 이동할 때.
	static int[] x = {-1, 1, 0, 0};
	static int[] y = {0, 0, 1, -1};
	
	private static int route(int down, int right) {
		
		//System.out.println("dp["+down+"]["+right+"] = "+ dp[down][right]);
		if(down==n-1 && right==m-1) {
			//System.out.println("end : "+dp[down][right]);
			return 1;
		}
		if(dp[down][right] != -1) {
			//System.out.println(" -> "+dp[down][right]);
			return dp[down][right];
		}
		
		dp[down][right]=0;
		for(int i=0;i<4;i++) {
			int x1 = right+x[i];
			int y1 = down+y[i];
			
			if(y1<0 || y1>=n || x1<0 || x1>=m) {
				continue;
			}
			
			if(map[y1][x1] < map[down][right]) {
				
				//System.out.println("new route! : "+y1+", "+x1);
				
				dp[down][right] += route(y1, x1);
			}
		}
		
		//System.out.println("!! "+dp[down][right]);
		return dp[down][right];
	}
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		n = Integer.parseInt(stk.nextToken());
		m = Integer.parseInt(stk.nextToken());
		map = new int[n][m];
		dp = new int[n][m];
		
		for(int i=0;i<n;i++) {
			stk = new StringTokenizer(bf.readLine());
			
			for(int j=0;j<m;j++) {
				map[i][j] = Integer.parseInt(stk.nextToken());
				dp[i][j] = -1;
			}
		}
		
		//dp[0][0] = 1;
		int result = route(0, 0);
		
		System.out.println(result);
	}

}
