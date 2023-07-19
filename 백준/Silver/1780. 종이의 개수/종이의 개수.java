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
	static int n;
	
	
	
	private static boolean search(int x, int y, int size) {
		
		int start = nine[x][y];
		//System.out.print("x : "+x+", y : "+y+"   ");
		for(int i=x;i<x+size;i++) {
			for(int j=y;j<y+size;j++) {
				if(nine[i][j] != start) {
					return false;
				}
			}
		}
		
		return true;
		
	}
	
	private static void color(int x, int y, int size) {
		
		if(search(x, y, size)) {
			if(nine[x][y]==0) {
				zero++;
				//System.out.println("zero : "+zero);
			}else if(nine[x][y]==1){
				one++;
				//System.out.println("one : "+one);
			}else {
				minus++;
				//System.out.println("minus : "+minus);
			}
			
			return;
		}
		
		size = size/3;
		
		// left, up
		color(x, y, size);
		// center, up
		color(x, y+(size), size);
		// right, up
		color(x, y+(size*2), size);
		// left, middle
		color(x+(size), y, size);
			//center, middle
		color(x+(size), y+(size), size);
		// right, middle
		color(x+(size), y+(size*2), size);
		// left, down
		color(x+(size*2), y, size);
		// center, down
		color(x+(size*2), y+(size), size);
		// right, down
		color(x+(size*2), y+(size*2), size);
		
		
		
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		
		n = Integer.parseInt(bf.readLine());
		
		nine = new int[n+1][n+1];
		
		for(int i=1;i<=n;i++) {
			StringTokenizer stk = new StringTokenizer(bf.readLine(), " ");
			for(int j=1;j<=n;j++) {
				nine[i][j] = Integer.parseInt(stk.nextToken());
				//System.out.print(nine[i][j]);
			}
			//System.out.println();
		}//
		
		color(1, 1, n);
		//leaf = leaf+")";
		System.out.println(minus+"\n"+zero+"\n"+one);
		
		
	}

}
