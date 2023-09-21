import java.io.*;
import java.util.*;
import java.math.*;
import java.time.*;

/*
 *  
 * */

public class Main {
	
	static int lis[];
	//
	private static int binary(int left, int right, int last) {
		
		//int result=0;
		
		while(left<right) {
			int mid = (left+right)/2;
			if(lis[mid] >= last) {
				right = mid;
			}else {
				left = mid+1;
			}
		}
		
		return right;
	}
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		//StringTokenizer stk = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(bf.readLine());
		int[] array = new int[n];
		lis = new int[n];
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		for(int i=0;i<n;i++) {
			array[i] = Integer.parseInt(stk.nextToken());
		}
		
		int j=0;
		lis[0] = array[0];
		
		
		for(int i=1;i<n;i++) {
			//System.out.println("=========");
			//System.out.println(i +" : "+array[i]);
			if(lis[j]<array[i]) {
				lis[++j] = array[i];
				//System.out.println("j : "+j);
			}else {
				int t = binary(0, j, array[i]); //0과 j 사이의 값 반환
				lis[t] = array[i];
				//System.out.println("t : "+t);
			}
		}
		
		/*for(int i=0;i<n;i++) {
			System.out.print(lis[i]+ " ");
		}*/
		//System.out.println();
		System.out.println(j+1);
		
	}

}
