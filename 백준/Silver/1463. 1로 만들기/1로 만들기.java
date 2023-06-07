import java.io.*;
import java.util.*;

public class Main {
	
	static int[] number;
	static int dp[];

	
	private static int search(int N) {
		
		
		
		//2부터는 메모이제이션 활용하기
		for(int i=2;i<=N;i++) {
			
			//6으로 나누어 떨어지는 수는, 2와 3으로 나눈 것 중 더 적은 값
			if(i%6==0) {
				dp[i] = Math.min(dp[i-1], Math.min(dp[i/3], dp[i/2]))+1;
			}
			
			//3으로 나누어 떨어질 떄
			else if(i%3==0) {
				
				dp[i] = Math.min(dp[i/3], dp[i-1])+1;
				/*if(i%2==0) {
					dp[i] = Math.min(dp[0], dp[i/2]);
				}*/
				
				
			}
			
			//2로 나누어 떨어질 때
			else if(i%2==0) {
				dp[i] = Math.min(dp[i-1], dp[i/2])+1;
				/*if(i%3==0) {
					dp[i] = Math.min(dp[i], dp[i/3]);
				}*/
				
				
			}
			//그 무엇도 아닐 때
			else {
				dp[i] = dp[i-1]+1;
			}
			
			//그리고 항상 1 더해주기
			
		}
		
		
		return dp[N];
	}
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		//StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(bf.readLine());
		number = new int[1000001];
		dp = new int[1000001];
		
		// 0과 1은 '0'으로 초기화
		dp[0] = dp[1] = 0;
		
		System.out.println(search(N));
		
		
	}

}
