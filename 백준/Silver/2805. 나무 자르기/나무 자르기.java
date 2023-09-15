import java.io.*;
import java.util.*;
import java.math.*;
import java.time.*;

/*
 *  
 * */

public class Main {
	
	/*static int[] trees;
	static int n;
	
	static int lan(int low, int high) {
		
		
		int mid = (low+high)/2;
		//System.out.println("mid : "+mid);
		int stack=0;
		
		for(int i=0;i<trees.length;i++) {
			stack += trees[i]/mid;
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
		int N = Integer.parseInt(stk.nextToken()); // trees that we have
		int M = Integer.parseInt(stk.nextToken()); // what we need
		
		int[] trees = new int[N];
		long right = 0;
		
		stk = new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++) {
			trees[i] = Integer.parseInt(stk.nextToken());
			right = Math.max(right, trees[i]);
		}
		
		long result=0;
		long left = 0;
		long mid=0;
		
		//result = lan(left, right);
		right++;
		while(left < right) {
			
			mid = (left+right)/2;
			//System.out.println("mid : "+mid);
			long stack = 0;
			
			for(int i=0;i<N;i++) {
				if(trees[i]>mid) {
					stack += (trees[i]-mid);
				}
				
			}
			//System.out.println("stack : "+ stack);
			if(stack >= M) {
				left = mid+1;
			}else {
				right = mid;
			}
			//System.out.println("right : "+right + " left : "+left);
			
		}
		result = left-1;
		
		System.out.println(result);
		
	}

}
