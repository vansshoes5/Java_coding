import java.io.*;
import java.util.*;

public class Main {
	
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int K = Integer.parseInt(stk.nextToken());
		
		int[] coins = new int[N+1];
		
		for(int i=1;i<=N;i++) {
			coins[i] = Integer.parseInt(bf.readLine());
		}
		
		int count = 0;
		int j=N;
		
		while(K>0) {
			if(coins[j]<=K) {
				K-=coins[j];
				count++;
			}else {
				j--;
			}
		}
		
		
		System.out.println(count);
		
	}

}
