import java.io.*;
import java.util.*;


public class Main {
	
	/*static int nine[][];
	static int minus = 0;
	static int zero = 0;
	static int one = 0;
	static int n;*/
	
	
	
	/*private static boolean search(int x, int y, int size) {
		
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
		
	}*/
	
	/*private static void color(int x, int y, int size) {
		
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
		
		
		
		
	}*/
	
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(stk.nextToken());
		int K = Integer.parseInt(stk.nextToken());
		
		int temp[] = new int[N];
		//int sum[] = new int[N+1];
		
		stk = new StringTokenizer(bf.readLine(), " ");
		
		for(int i=0;i<N;i++) {
			temp[i] = Integer.parseInt(stk.nextToken());
			//sum[i] = sum[i-1]+temp[i];
			//System.out.println("temp["+i+"] : "+temp[i]+", sum["+i+"] : "+sum[i]);
		}
		
		//int count=1;
		int result = 0;
		int sum=0;
		for(int i=0;i<N;i++) {
			sum += temp[i];
			if(i==K-1) {
				result = sum;
			}
			if(i>=K) {
				sum = sum-temp[i-K];
				result = Math.max(result, sum);
			}
			

		}
		System.out.println(result);
		
		
		
		
		
	}

}
