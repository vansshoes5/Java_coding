import java.io.*;
import java.util.*;

public class Main {
	
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		int[] road = new int[N-1];
		int[] cost = new int[N];
		
		long result =0;
		
		int total = 0;
		StringTokenizer stk = new StringTokenizer(bf.readLine(), " ");
		for(int i=0;i<N-1;i++) {
			road[i] = Integer.parseInt(stk.nextToken());
			total += road[i];
		}
		
		stk = new StringTokenizer(bf.readLine(), " ");
		for(int i=0;i<N;i++) {
			cost[i] = Integer.parseInt(stk.nextToken());
		}
		
		for(int i=0;i<N-1;i++) {
			//int count;
			for(int j=0;j<road[i];j++) {
				result += cost[i];
			}
			if(cost[i]<cost[i+1]) {
				for(int j=0;j<road[i+1];j++) {
					result += cost[i];
				}
				i++;
			}
			//System.out.println("result : "+result);
			
		}
		System.out.println(result);
		
		
	}

}
