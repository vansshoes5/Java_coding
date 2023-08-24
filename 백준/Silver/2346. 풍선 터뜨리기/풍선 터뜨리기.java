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
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(bf.readLine());
		
		Deque<Integer> deq = new ArrayDeque<>();
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		
		for(int i=N;i>=1;i--) {
			//int x = Integer.parseInt(stk.nextToken());
			deq.offerLast(i);
		}
		
		
		
		int[] move = new int[N+1];
		for(int i=1;i<=N;i++) {
			move[i] = Integer.parseInt(stk.nextToken());
		}
		
		int x = move[deq.peekLast()];
		sb.append(deq.pollLast()).append(" ");
		for(int i=0;i<N-1;i++) {
			//deq.offerFirst(i);
			
			
			if(x>0) {
				for(int j=0;j<x-1;j++) {
					deq.addFirst(deq.pollLast());
				}
			}else if(x<0) {
				for(int j=x;j<0;j++) {
					deq.addLast(deq.pollFirst());
				}
			}
			
			x= move[deq.peekLast()];
			//System.out.println(x);
			sb.append(deq.pollLast()).append(" ");
		}
		
		System.out.println(sb);
		
	}

}
