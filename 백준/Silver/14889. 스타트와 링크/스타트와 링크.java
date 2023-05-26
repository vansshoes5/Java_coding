import java.io.*;
import java.util.*;

public class Main {
	
	static int N;
	static int[][] team;
	static int min = Integer.MAX_VALUE;
	
	static boolean[] check;
	
	private static void build() {
		// i = 1~N
		// j = i~N
		int start=0;
		int link=0;
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
							//false 친구들은 start팀으로
				if(check[i] == false && check[j]==false) {
					start+=team[i][j];
					start+=team[j][i];
				}
				//true 친구들은 link 팀으로
				else if(check[i]==true && check[j]==true){
					link+=team[i][j];
					link+=team[j][i];
				}
			}
		}
					
		//최솟값 계산하기, 0되면 그냥 출력하기
		int result = Math.abs(start-link);
		if(result==0) {
			System.out.println(result);
			System.exit(0);
		}
					
		min = Math.min(result, min);
	}
	
	private static void ovr(int p, int index) {
		
		//N개 중 절반만 검사해도 나머지가 분류가능하므로 N/2를 넘어가면 재귀 종료
		if(index==N/2) {
			//min = Math.min(min, Math.abs(startTeam-linkTeam));
			
			build();
			
			return;
		}
		
		//절반까지 채우지 못한 경우
		for(int i=p;i<N;i++) {
			
			//안 들린 친구라면 들렀다고 표시해주기
			if(!check[i]) {
				check[i]=true;
				//들른 경우, 다음으로 들를 친구를 찾기 위해 재귀함수 호출
				ovr(i+1, index+1);
				
				//다 들렀다 오면 다시 false;
				check[i] =false;
			}
		}
		
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		//StringBuilder sb = new StringBuilder();
		
		// N 입력하기
		N = Integer.parseInt(bf.readLine());
		
		
		
		//배열 생성
		team = new int[N][N];
		check = new boolean[N];
		
		//능력치 입력받기
		for(int i=0;i<N;i++) {
			stk = new StringTokenizer(bf.readLine());
			for(int j=0;j<N;j++) {
				team[i][j] = Integer.parseInt(stk.nextToken());
			}
		}
		//함수 작동
		ovr(0, 0);
		
		//최솟값출력
		System.out.println(min);
		
	}

}
