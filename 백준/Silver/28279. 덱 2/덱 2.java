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
		
		Deque<Integer> deq = new LinkedList<>();
		
		int x;
		
		while(N>0) {
			StringTokenizer stk = new StringTokenizer(bf.readLine());
			int order = Integer.parseInt(stk.nextToken());
			
			switch(order) {
			case 1:
				x = Integer.parseInt(stk.nextToken());
				deq.offerFirst(x);
				break;
				
			case 2:
				x = Integer.parseInt(stk.nextToken());
				deq.offerLast(x);
				break;
				
			case 3:
				if(deq.isEmpty()) {
					sb.append("-1\n");
					//System.out.println(-1);
				}else {
					sb.append(deq.pollFirst()).append("\n");
					//System.out.println(deq.pollFirst());
				}
				break;
				
			case 4:
				if(deq.isEmpty()) {
					sb.append("-1\n");
					//System.out.println(-1);
				}else {
					sb.append(deq.pollLast()).append("\n");
					//System.out.println(deq.pollLast());
				}
				break;
				
			case 5:
				sb.append(deq.size()).append("\n");
				//System.out.println(deq.size());
				break;
				
			case 6:
				if(deq.isEmpty()) {
					sb.append("1\n");
					//System.out.println(1);
				}else {
					sb.append("0\n");
					//System.out.println(0);
				}
				break;
				
			case 7:
				if(deq.isEmpty()) {
					sb.append("-1\n");
					//System.out.println(-1);
				}else {
					sb.append(deq.peekFirst()).append("\n");
					//System.out.println(deq.peekFirst());
				}
				break;
			case 8:
				if(deq.isEmpty()) {
					sb.append("-1\n");
					//System.out.println(-1);
				}else {
					sb.append(deq.peekLast()).append("\n");
					//System.out.println(deq.peekLast());
				}
				break;
			}
			N--;
		}
		
		System.out.println(sb);
		
	}

}
