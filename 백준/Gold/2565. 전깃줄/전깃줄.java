import java.io.*;
import java.util.*;

public class Main {
	
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		StringTokenizer stk;
		
		int[][] line = new int[N][2];
		int[] dp = new int[N];
		
        //입력받기
		for(int i=0;i<N;i++) {
			stk  = new StringTokenizer(bf.readLine(), " ");
			line[i][0] = Integer.parseInt(stk.nextToken());
			line[i][1] = Integer.parseInt(stk.nextToken());
		}
		
        //입력받은 전깃줄을 왼쪽 기준으로 정렬하기
		Arrays.sort(line, new Comparator<int[]>() {
			@Override
			public int compare(int[] s1, int[] s2) {
				return s1[0]-s2[0];
			}
		});
		
        
		int min = 100;
		
        
		for(int i=0;i<N;i++) {
            //i번째 전깃줄 설치할 때,
			dp[i] = 1;
            
            //지금까지 설치된 전깃줄 검토
			for(int j=0;j<i;j++) {
                
                //겹치지 않을 때, 
				if(line[i][1]>line[j][1]) {
                    
                    //dp[i]의 현재값이 큰지, j번째 전깃줄의 dp 값이 큰지 비교하기
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
            
			//System.out.println(i+" : "+dp[i]);
			min = Math.min(min, (N-dp[i]));
		}
		
		System.out.println(min);
		
		
		
	}

}
