import java.io.*;
import java.util.*;
import java.math.*;
import java.time.*;

/*
 *  체스판 또 칠해..
 *  
 *   * 누적합으로 풀기
 *   
 *   (i, j) 번째 좌표의 누적합 = (i-1, j) + (i, j-1) - (i-1,j-1)
 *  
 *  
 *  1. 좌표의 합이 (짝수, W), (홀수, B)일 때
 *  	1) 흰색은 누적합, 검정색은 누적합+1
 *  2 좌표의 합이 (짝수, B), (홀수, W)
 *  	1) 검정색 누적합, 흰색을 누적합+1
 *  
 *  3. k*k 알아낼 때는?
 *  	1) n*m에서 k*k에 맞아떨어지는 시작 좌표들을 범위 지정하기
 *  		ex) i = 0~n-k, j = 0~m-k
 *  	2) k*k로 이루어진 보드판 중 i>1, j>1인 경우
 *  	3) 각 보드판의 원소에서 포함되지 않은 원소의 값만큼 빼주면
 *  	4) k*k의 누적합이 나온다.
 *  	
 *  	ex) 예제 1을 보았을 때, 가장 우측 하단의 3*3 보드판에서
 *  		포함되지 않은 세로줄과 가로줄의 원소들의 합을
 *  		각 원소에서 빼주면, 원하는 누적합이 나온다.
 *  
 *  	필요한 메소드
 *  	1) 좌표 위치 참/거짓 메소드
 *  	2) W
 *  	3) B
 * */

public class Main {
	
	
	static int[][] black_dp, white_dp;
	
	//참/거짓
	private static boolean check(int x, int y) {
		
		return x%2==0&&y%2==0 || x%2==1&&y%2==1;
		
	}
	
	private static void whiteDp(int i, int j) {
		white_dp[i][j] = white_dp[i-1][j]+white_dp[i][j-1]-white_dp[i-1][j-1]+1;
		black_dp[i][j] = black_dp[i-1][j]+black_dp[i][j-1]-black_dp[i-1][j-1];
		/*System.out.print(" w : "+white_dp[i][j]);
		System.out.print(" b : "+ black_dp[i][j]);
		System.out.print("|");*/
	}
	
	private static void blackDp(int i, int j) {
		black_dp[i][j] = black_dp[i-1][j]+black_dp[i][j-1]-black_dp[i-1][j-1]+1;
		white_dp[i][j] = white_dp[i-1][j]+white_dp[i][j-1]-white_dp[i-1][j-1];
		/*System.out.print(" w : "+white_dp[i][j]);
		System.out.print(" b : "+ black_dp[i][j]);
		System.out.print("|");*/
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(stk.nextToken());
		int m = Integer.parseInt(stk.nextToken());
		int K = Integer.parseInt(stk.nextToken());
		
		int min = Integer.MAX_VALUE;
		
		black_dp = new int[2001][2001];
		white_dp = new int[2001][2001];
		
		
		//System.out.println();
		
		for(int i=1;i<=n;i++) {
			String board = bf.readLine();
			for(int j=1;j<=m;j++) {
				//System.out.print(board.charAt(j-1));
				if(board.charAt(j-1)=='B') {
					if(check(i, j)) {
						whiteDp(i, j);
					}else {
						blackDp(i, j);
					}
				}else {
					if(check(i, j)) {
						blackDp(i, j);
					}else {
						whiteDp(i, j);
					}
				}
			}
			//System.out.println();
		}
		
		for(int i=0;i<=n-K;i++) {
			for(int j=0;j<=m-K;j++) {
				min = Math.min(min, 
						Math.min(black_dp[i+K][j+K]+black_dp[i][j]-black_dp[i+K][j]-black_dp[i][j+K], 
								white_dp[i+K][j+K]+white_dp[i][j]-white_dp[i][j+K]-white_dp[i+K][j]));
				//System.out.println(min);
				/*if(min<0) {
					min=0;
				}*/
			}
		}
		System.out.println(min);

	}

}
