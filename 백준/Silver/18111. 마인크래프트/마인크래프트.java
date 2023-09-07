import java.io.*;
import java.util.*;
import java.math.*;
import java.time.*;

/*
 *  
 * */

public class Main {
	
	
	
	//
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		int I = Integer.parseInt(stk.nextToken());
		
		
		int[][] block = new int[N][M];
		int result=0;
		int ans=Integer.MAX_VALUE;
		
		for(int i=0;i<N;i++) {
			stk = new StringTokenizer(bf.readLine());
			for(int j=0;j<M;j++) {
				block[i][j] = Integer.parseInt(stk.nextToken());
				
			}
		}
		
		for(int i=0;i<=256;i++) {
			int remove=0;
			int install=0;
			int time=0;
			
			for(int j=0;j<N;j++) {
				for(int k=0;k<M;k++) {
					if(block[j][k]>i) {
						remove += (block[j][k]-i);
						
					}else {
						install += (i-block[j][k]);
					}
				}
			}
			
			if(remove+I < install) {
				continue;
			}
			
			time = remove*2+install;
			if(time<=ans) {
				ans = time;
				result = i;
			}
			
		}
		
		System.out.println(ans +" "+result);
		
		
		
	}

}
