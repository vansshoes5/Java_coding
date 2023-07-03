import java.io.*;
import java.util.*;

public class Main {
	
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer stk = new StringTokenizer(bf.readLine(), " ");
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		
		int[] arr = new int[N+1];
		int[] sum = new int[N+1];
		stk = new StringTokenizer(bf.readLine(), " ");
		for(int i=1;i<=N;i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
			sum[i] = sum[i-1]+arr[i];
		}
		
		for(int i=0;i<M;i++) {
			stk = new StringTokenizer(bf.readLine(), " ");
			int b = Integer.parseInt(stk.nextToken());
			int e = Integer.parseInt(stk.nextToken());
			int hap = 0;
			
			hap = sum[e]-sum[b-1];
			sb.append(hap).append("\n");
			
		}
		System.out.println(sb);
	}

}
