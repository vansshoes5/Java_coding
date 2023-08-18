import java.io.*;
import java.util.*;
import java.math.*;
import java.time.*;

/*
 *  
 * */

public class Main {
	
	static int arr[];
	static int numbers[];
	static int n;
	
	private static void lotto(int x, int index, StringBuilder sb) {
		
		if(index==6) {
			for(int i : numbers) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=x;i<n;i++) {
			numbers[index] = arr[i];
			lotto(i+1, index+1, sb);
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		//n = sc.nextInt();
		//c = sc.nextInt();
		
		StringTokenizer stk/* = new StringTokenizer(bf.readLine())*/;
		
		while(true) {
			stk = new  StringTokenizer(bf.readLine());
			n = Integer.parseInt(stk.nextToken());
			if(n==0) {
				break;
			}
			arr = new int[n];
			numbers = new int[6];
			
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(stk.nextToken());
			}
			
			lotto(0, 0, sb);
			sb.append("\n");
			
		}
		
		System.out.println(sb);
		
	}

}
