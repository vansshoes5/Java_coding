import java.io.*;
import java.util.*;

/*
 *  
 *  
 *  
 * */

public class Main {
	
	static int[][] paper;
	static int n, m;
	
	//좌표기준 4칸 일직선(가로, 세로)
	private static int straight(int x, int y) {
		
		int result=0;
		//System.out.print(x+", "+y);
		//가로 만들기
		if(y<m-3) {
			int temp=paper[x][y]+paper[x][y+1]+paper[x][y+2]+paper[x][y+3];
			result = Math.max(result, temp);
		}
		if(x<n-3) {
			int temp=paper[x][y]+paper[x+1][y]+paper[x+2][y]+paper[x+3][y];
			result = Math.max(result, temp);
		}
		//System.out.println(" = "+result);
		
		return result;
	}
	
	//좌표기준 4칸 정사각형(우하향)
	private static int square(int x, int y) {
		
		int result=0;
		
		if(x==n-1 || y==m-1) {
			return result;
		}
		
		for(int i=x;i<x+2;i++) {
			for(int j=y;j<y+2;j++) {
				result += paper[i][j];
			}
		}
		return result;
	}
	
	//좌표 기준 L자 만들기
	private static int makeL(int x, int y) {
		
		int result=0;
		
		//up
		if(y<m-1 && x>1) {
			int temp = paper[x][y]+paper[x-1][y]+paper[x-2][y];
			temp += paper[x][y+1];
			result = Math.max(result, temp);
		}
		//left
		if(x>0 && y>1) {
			int temp = paper[x][y]+paper[x][y-1]+paper[x][y-2];
			temp += paper[x-1][y];
			result = Math.max(result, temp);
		}
		//down
		if(x<n-2 && y>0) {
			int temp = paper[x][y]+paper[x+1][y]+paper[x+2][y];
			temp += paper[x][y-1];
			result = Math.max(result, temp);
		}
		//right
		if(x<n-1 && y<m-2) {
			int temp = paper[x][y]+paper[x][y+1]+paper[x][y+2];
			temp += paper[x+1][y];
			result = Math.max(result, temp);
		}
		
		return result;
	}
	
	//좌표기준 반대 ㄱ자 만들기
	private static int makeR(int x, int y) {

		int result=0;
		
		//up
		if(x>1 && y>0) {
			int temp = paper[x][y]+paper[x-1][y]+paper[x-2][y];
			temp += paper[x][y-1];
			result = Math.max(result, temp);
		}
		//left
		if(x<n-1 && y>1) {
			int temp = paper[x][y]+paper[x][y-1]+paper[x][y-2];
			temp += paper[x+1][y];
			result = Math.max(result, temp);
		}
		//down
		if(x<n-2 && y<m-1) {
			int temp = paper[x][y]+paper[x+1][y]+paper[x+2][y];
			temp += paper[x][y+1];
			result = Math.max(result, temp);
		}
		//right
		if(x>0 && y<m-2) {
			int temp = paper[x][y]+paper[x][y+1]+paper[x][y+2];
			temp += paper[x-1][y];
			result = Math.max(result, temp);
		}
		
		return result;
	}
	
	private static int snake(int x, int y) {
		
		int result=0;
		int top=0;
		
		
		// 세로
		if(x>0 && x<n-1 && y<m-1) {
			int temp = paper[x][y]+paper[x][y+1]+paper[x-1][y]+paper[x+1][y+1];
			int play = paper[x][y]+paper[x][y+1]+paper[x-1][y+1]+paper[x+1][y];
			top = Math.max(play, temp);
			
		}
		if(x<n-1 && y>0 && y<m-1) {
			int temp = paper[x][y]+paper[x][y+1]+paper[x+1][y]+paper[x+1][y-1];
			int play = paper[x][y]+paper[x][y-1]+paper[x+1][y]+paper[x+1][y+1];
			result = Math.max(play, temp);
					
		}
		result = Math.max(result, top);
		
		return result;
	}
	
	private static int moeum(int x, int y) {
		
		int result=0;
		
		//up
		if(x>0 && y>0 && y<m-1) {
			int temp = paper[x][y]+paper[x-1][y]+paper[x][y-1]+paper[x][y+1];
			result = Math.max(result, temp);
		}
		//down
		if(x<n-1 && y>0 && y<m-1) {
			int temp = paper[x][y]+paper[x+1][y]+paper[x][y-1]+paper[x][y+1];
			result = Math.max(result, temp);
		}
		//left
		if(x>0 && x<n-1 && y>0) {
			int temp = paper[x][y]+paper[x-1][y]+paper[x+1][y]+paper[x][y-1];
			result = Math.max(result, temp);
		}
		//right
		if(x>0 && x<n-1 && y<m-1) {
			int temp = paper[x][y]+paper[x-1][y]+paper[x+1][y]+paper[x][y+1];
			result = Math.max(result, temp);
		}
		
		return result;
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		//input
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		n = Integer.parseInt(stk.nextToken());
		m = Integer.parseInt(stk.nextToken());
		
		paper = new int[n][m];
		for(int i=0;i<n;i++) {
			stk = new StringTokenizer(bf.readLine());
			for(int j=0;j<m;j++) {
				paper[i][j] = Integer.parseInt(stk.nextToken());
			}
		}
		
		int result = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				
				result = Math.max(result, straight(i, j));
				result = Math.max(result, square(i, j));
				result = Math.max(result, makeL(i, j));
				result = Math.max(result, makeR(i, j));
				result = Math.max(result, snake(i, j));
				result = Math.max(result, moeum(i, j));
			}
		}
		
		System.out.println(result);
		
	}

}
