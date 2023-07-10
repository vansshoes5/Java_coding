import java.io.*;
import java.util.*;



/*
 * 색종이
 * 
 * 1. 1~size 색상 비교
 * 		1) 색상이 모두 같으면, white/blue 값을 1 증가
 * 2. 색상이 다를 때, size /= 2;  정사각형을 4등분 하여 다시 색상 비교하기
 * 3. 
 * 		1) 왼쪽 위 : x, y, size
 * 		2) 오른쪽 위 : x, y+size, size
 * 		3) 왼쪽 아래 : x+size, y, size
 * 		4) 오른쪽 아래 : x+size, y+size, size
 * 
 * 4. 비교는?
 * 		
 * 		1) x,y 시작점과 size값을 마라미터로 받아
 * 		2) 해당 범위만큼 탐색하기
 * 		3) 다른 점을 발견하면 false, 아니면 true 반환
 * 
 * */

public class Main {
	
	static int nine[][];
	static int minus = 0;
	static int zero = 0;
	static int one = 0;
	
	
	
	/*private static boolean search(int x, int y, int size) {
		
		int start = nine[x][y];
		
		
		
		return true;
		
	}*/
	
	/*private static void color(int x, int y, int size) {
		
		if(search(x, y, size)) {
			if(nine[x][y]==0) {
				
			}else {
				
			}
			return;
		}
		
		size = size/3;
		
		// left, up
		color();
		// center, up
		color();
		// right, up
		color();
		// left, middle
		color();
		//center, middle
		color();
		// right, middle
		color();
		// left, down
		color();
		// center, down
		color();
		// right, down
		color();
		
		
	}*/

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(bf.readLine(), " ");
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		
		//bf.close();
		int[][] table = new int[N+1][N+1];
		int[][] stack = new int[N+1][N+1];
		
		for(int i=1;i<=N;i++) {
			stk = new StringTokenizer(bf.readLine());
			for(int j=1;j<=N;j++) {
				table[i][j] = Integer.parseInt(stk.nextToken());
				stack[i][j] = stack[i][j-1]+table[i][j];
				//System.out.print(stack[i][j]+" ");
			}
			//System.out.println();
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<M;i++) {
			stk = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			int c = Integer.parseInt(stk.nextToken());
			int d = Integer.parseInt(stk.nextToken());
			
			int count=0;
			
			for(int j=a;j<=c;j++) {
				count += stack[j][d];
				count -= stack[j][b-1];
			}
			
			sb.append(count).append("\n");
			
		}
		System.out.println(sb);
		
		//int n = Integer.parseInt(bf.readLine());
		
		/*nine = new int[n+1][n+1];
		
		for(int i=1;i<=n;i++) {
			StringTokenizer stk = new StringTokenizer(bf.readLine(), " ");
			for(int j=1;j<=n;j++) {
				nine[i][j] = Integer.parseInt(stk.nextToken());
				//System.out.print(quater[i][j]);
			}
			//System.out.println();
		}
		
		//color(1, 1, n);
		//leaf = leaf+")";
		//System.out.println();
		//System.out.println(/*"white : "+*///wh);
		//System.out.println(/*"blue : "+*/bl);
		
	}

}
