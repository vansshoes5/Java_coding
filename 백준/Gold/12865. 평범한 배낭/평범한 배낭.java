import java.io.*;
import java.util.*;

public class Main {
	
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		
		StringTokenizer stk = new StringTokenizer(bf.readLine(), " ");
		int N = Integer.parseInt(stk.nextToken());
		int K = Integer.parseInt(stk.nextToken());
		
		
		int[][] things = new int[N+1][3];//물건의 무게와 가치
		int[][] dp = new int[N+1][K+1];//각 무게별 합
		
		for(int i=1;i<=N;i++) {
			stk  = new StringTokenizer(bf.readLine(), " ");
			things[i][1] = Integer.parseInt(stk.nextToken());
			things[i][2] = Integer.parseInt(stk.nextToken());
		}
		
		int result = 0;
		
		
		/*2차원 dp
		 * 가로 j는 각 무게별 최댓값
		 * 세로 i는 물건 하나씩 추가할 때마다 최댓값 
		 * 
		*/
		for(int i=0;i<=N;i++) {
			for(int j=0;j<=K;j++) {
				//System.out.print("i : "+i+" j : "+j);
				
				//0이 들어가면 해당 dp는 0
				if(i==0 || j==0) {
					dp[i][j] = 0;
				}
				
				// 현재 j값이 i번째 물건의 무게보다 클 때
				else if(things[i][1]<=j){
					
					//i-1번째 물건 j무게의 가치 vs 'j-i번째 물건의 무게'의 가치 + 'i번째 물건의 가치'
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-things[i][1]]+things[i][2]);
				}
				
				//작다면 그냥 i-1번째 물건의 현재 무게 가치를 넣는다.
				else {
					dp[i][j] = dp[i-1][j]; 
				}
				//System.out.println(" --> dp["+i+"]["+j+"] : "+dp[i][j]);
				result = Math.max(result, dp[i][j]);
			}
			
		}
		
		System.out.println(result);
		
		
		
		
		
		//System.out.println(result);
	}

}
