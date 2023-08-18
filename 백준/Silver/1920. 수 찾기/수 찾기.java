import java.io.*;
import java.util.*;
import java.math.*;
import java.time.*;

/*
 *  
 * */

public class Main {
	
	
	static int[] arr;
	
	private static int binary(int begin, int end, int n) {
		int mid;
		
		if(begin<=end) {
			mid = (begin+end)/2;
			if(arr[mid]==n) {
				return 1;
			}
			else if(n<arr[mid]) {
				return binary(begin,mid-1, n);
			}else {
				return binary(mid+1, end, n);
			}
		}
		return 0;
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(bf.readLine());
		arr = new int[n];
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		Arrays.sort(arr);
		
		int M = Integer.parseInt(bf.readLine());
		stk = new StringTokenizer(bf.readLine());
		for(int i=0;i<M;i++) {
			int num = Integer.parseInt(stk.nextToken());
			System.out.println(binary(0, n-1, num));
		}
		
	}

}
