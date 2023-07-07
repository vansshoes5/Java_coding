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
	
	static int quater[][];
	static int wh = 0;
	static int bl = 0;
	
	static String leaf = "";
	
	private static boolean search(int x, int y, int size) {
		
		int start = quater[x][y];
		
		for(int i=x;i<x+size;i++) {
			for(int j=y;j<y+size;j++) {
				if(quater[i][j] != start) {
					return false;
				}
			}
		}
		
		return true;
		
	}
	
	private static void color(int x, int y, int size) {
		
		if(search(x, y, size)) {
			if(quater[x][y]==0) {
				leaf = leaf+0;
			}else {
				leaf = leaf+1;
			}
			return;
		}
		
		size = size/2;
		leaf = leaf+"(";
		// L - up
		color(x, y, size);
		// R - up
		color(x, y+size, size);
		// L - down
		color(x+size, y, size);
		
		// R - down
		color(x+size, y+size, size);
		leaf= leaf+")";
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		quater = new int[n+1][n+1];
		
		for(int i=1;i<=n;i++) {
			String line = bf.readLine();
			for(int j=1;j<=n;j++) {
				quater[i][j] = Character.getNumericValue(line.charAt(j-1));
				//System.out.print(quater[i][j]);
			}
			//System.out.println();
		}
		
		color(1, 1, n);
		//leaf = leaf+")";
		System.out.println(leaf);
		//System.out.println(/*"white : "+*/wh);
		//System.out.println(/*"blue : "+*/bl);
		
	}

}
