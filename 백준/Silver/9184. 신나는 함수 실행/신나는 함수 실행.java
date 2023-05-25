import java.io.*;
import java.util.*;

public class Main {
	
	static long con[][][] = new long[21][21][21];
	
	
	private static long what(int a, int b, int c) {
		
		for(int i=0;i<21;i++) {
			for(int j=0;j<21;j++) {
				for(int k=0;k<21;k++) {
					
					if(i==0 || j==0 || k==0) {
						con[i][j][k] = 1;
					}else {
						if(i<j && j<k) {
							con[i][j][k] = con[i][j][k-1]+con[i][j-1][k-1] - con[i][j-1][k];
						}else {
							con[i][j][k] = con[i-1][j][k]+con[i-1][j-1][k]+con[i-1][j][k-1] - con[i-1][j-1][k-1];
						}
					}
					
					
				}
			}
		}
		if(a<=0 || b<=0 || c<=0) {
			return 1;
		}
		if(a>20 | b>20 || c>20) {
			return what(20, 20, 20);
		}
		
		
		return con[a][b][c];
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			stk = new StringTokenizer(bf.readLine(), " ");
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			int c = Integer.parseInt(stk.nextToken());
			
			if(a==-1 && b==-1 && c==-1) {
				break;
			}
			
			//System.out.println(what(a, b, c));
			sb.append("w(").append(a+", "+b+", "+c+") = "+what(a, b, c));
			sb.append("\n");
		}
		
		System.out.println(sb);
		
		
	}

}
