import java.io.*;
import java.util.*;
import java.math.*;
import java.time.*;

/*
 *  로봇청소기
 * 
 *  1. 연구소 크기과, 연구소 내부 상태 입력받기
 *  2. 
 * */

public class Main {
	
	static int room[][] = new int[50][50];
	static int count=0;
	 // 0 = north, 1 = east, 2 = south, 3 = 	west
	private static void cleanic(int a, int b, int c) {
		//a, b = x, y좌표, c = 방향
		if(room[a][b]==0) {
			count++;
			room[a][b] = 2;
		}else if(room[a][b]==1){
			return;
		}
		
		//주변 4칸에 청소 안 된 빈칸이 없을 때
		if(check(a, b)) {
			if(c==0) {
				cleanic(a+1, b, c);
			}else if(c==1) {
				cleanic(a, b-1, c);
			}else if(c==2) {
				cleanic(a-1, b, c);
			}else {
				cleanic(a, b+1, c);
			}
		}//청소 안 된 빈칸 있을 때
		else {
			while(true) {
				if(c==0) {
					c=3;
				}else {
					c--;
				}
				if(c==0) {
					if(room[a-1][b]==0) {
						a= a-1;
						break;
					}
				}else if(c==1) {
					if(room[a][b+1]==0) {
						b = b+1;
						break;
					}
				}else if (c==2) {
					if(room[a+1][b]==0) {
						a = a+1;
						break;
					}
				}else {
					if(room[a][b-1]==0) {
						b=b-1;
						break;
					}
				}
				
			}
			cleanic(a, b, c);
		}
		
	}
	
	private static boolean check(int x, int y) {
		
		if(room[x][y-1]!=0) {
			if(room[x][y+1]!=0) {
				if(room[x-1][y]!=0) {
					if(room[x+1][y]!=0) {
						return true;
					}
				}
			}
		}
		return false;
		
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		
		 stk = new StringTokenizer(bf.readLine());
		 int x = Integer.parseInt(stk.nextToken());
		 int y = Integer.parseInt(stk.nextToken());
		 // 0 = north, 1 = east, 2 = south, 3 = 	west
		 int toward = Integer.parseInt(stk.nextToken());
		 
		 for(int i=0;i<N;i++) {
			 stk = new StringTokenizer(bf.readLine());
			 for(int j=0;j<M;j++) {
				 room[i][j] = Integer.parseInt(stk.nextToken());
			 }
		 }
		 
		 cleanic(x, y, toward);
		 System.out.println(count);
		
	}

}
