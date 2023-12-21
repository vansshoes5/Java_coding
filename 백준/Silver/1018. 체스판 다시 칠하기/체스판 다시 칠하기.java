import java.io.*;
import java.util.*;

/*
 *  
 *  
 *  
 * */

public class Main {
	
	static int n =0, m=0;
	static String[] chess;
	
	private static int leftUp(int x, int y) {
		int result=64;
		if(x+7>=n || y+7>=m) {
			return result;
		}
		
		//좌측 상단을 B기준으로 했을 때
		int black=0;
		for(int i=x;i<x+8;i++) {
			for(int j=y;j<y+8;j++) {
				// 도 'B'이어야 한다.
				if((x+y)%2 == (i+j)%2) {
					if(chess[i].charAt(j)!='B') {
						
						black++;
					}
				}
				//홀수는 'W'이어야 한다.
				else if((x+y)%2 != (i+j)%2){
					if(chess[i].charAt(j)!='W') {
						
						black++;
					}
				}
			}
		}
		//System.out.println("black: "+black);
		result = Math.min(result, black);
		
		//W 기준으로 했을 때
		int white=0;
		for(int i=x;i<x+8;i++) {
			for(int j=y;j<y+8;j++) {

				if((x+y)%2 == (i+j)%2) {
					if(chess[i].charAt(j)!='W') {
						
						white++;
					}
				}
				else if((x+y)%2 != (i+j)%2){
					if(chess[i].charAt(j)!='B') {
						
						white++;
					}
				}
			}
		}
		//System.out.println("white: "+white);
		result = Math.min(result, white);
		
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
		chess = new String[n];
		
		for(int i=0;i<n;i++) {
			
			chess[i] = bf.readLine();
		}
		
		int min=64;
		
		for(int i=0;i<n-7;i++) {
			for(int j=0;j<m-7;j++) {
				//System.out.println(i+", "+j+"="+leftUp(i,j));
				min = Math.min(min, leftUp(i, j));
			}
		}
		
		System.out.println(min);
		
	}

}
