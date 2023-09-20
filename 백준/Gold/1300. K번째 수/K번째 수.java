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
		
		//StringTokenizer stk = new StringTokenizer(bf.readLine());
		long N = Integer.parseInt(bf.readLine()); 
		long k = Long.parseLong(bf.readLine());
		
		long left = 1;
		long right = k;
		
		
		while(left<right) {
			
			long mid = (left+right)/2;
			long count=0;
			
			//System.out.println("mid "+mid);
			
			for(int i=1;i<=N;i++) {
				count += Math.min(mid/i, N);
				//System.out.println(i+" : "+mid/i);
			}
			//System.out.println("l : "+left+" count : "+count);
			if(count<k) {
				left = mid+1;
			}else {
				right = mid;
			}
			
			
		}
		
		
		System.out.println(left);
		
	}

}
