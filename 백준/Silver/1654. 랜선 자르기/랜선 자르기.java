import java.io.*;
import java.util.*;
import java.math.*;
import java.time.*;

/*
 *  
 * */

public class Main {
	
	/*static int[] lines;
	static int n;
	
	static int lan(int low, int high) {
		
		
		int mid = (low+high)/2;
		//System.out.println("mid : "+mid);
		int stack=0;
		
		for(int i=0;i<lines.length;i++) {
			stack += lines[i]/mid;
		}
		if(stack==n) {
			return mid;
		}else if(stack > n) {
			return lan(mid+1, high);
		}else {
			return lan(low, mid-1);
		}
		
		
	}*/
	//
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		int k = Integer.parseInt(stk.nextToken()); // lines that we have
		int n = Integer.parseInt(stk.nextToken()); // what we need
		
		int[] lines = new int[k];
		long right = 0;
		
		for(int i=0;i<k;i++) {
			lines[i] = Integer.parseInt(bf.readLine());
			right = Math.max(right, lines[i]);
		}
		
		long result=0;
		long left = 0;
		long mid=0;
		
		//result = lan(left, right);
		right++;
		while(left < right) {
			
			mid = (left+right)/2;
			//System.out.println(mid);
			long stack = 0;
			
			for(int i=0;i<k;i++) {
				stack += lines[i]/mid;
			}
			//System.out.println("stack : "+ stack);
			if(stack < n) {
				right = mid;
			}else {
				left = mid+1;
			}
			//System.out.println("right : "+right + " left : "+left);
			
		}
		result = left-1;
		
		System.out.println(result);
		
	}

}
