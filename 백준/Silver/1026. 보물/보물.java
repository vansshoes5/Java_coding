import java.io.*;
import java.util.*;
import java.math.*;
import java.time.*;

/*
 *  
 * */

public class Main {
	
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//long[] fibo = new long[91];
		
		int N = Integer.parseInt(bf.readLine());
		int A[] = new int[N];
		int B[] = new int[N];
		
		int Ap[] = new int[N];
		
		StringTokenizer stk;
		
		//int min=100;
		stk = new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++) {
			 
			 A[i] = Integer.parseInt(stk.nextToken());
			 //min = Math.min(min, A[i]);
		}
		stk = new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++) {
			 
			 B[i] = Integer.parseInt(stk.nextToken());
			// max = Math.max(max, B[i]);
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		int result= 0;
		for(int i=0;i<N;i++) {
			
			result = result+A[i]*B[N-1-i];
		}
		
		System.out.println(result);
		
	}

}
