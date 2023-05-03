import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> deq = new LinkedList<>();
		
		StringTokenizer stk = new StringTokenizer(bf.readLine(), " ");
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		
		int count = 0;
		
		for(int i=1;i<=N;i++) {
			deq.addLast(i);
		}
		
		stk = new StringTokenizer(bf.readLine(), " "); 
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<M;i++) {
			q.add(Integer.parseInt(stk.nextToken()));
		}
		
		while(M>0) {
			
			int index = deq.indexOf(q.peek());
			int half = deq.size()%2==0? deq.size()/2-1:deq.size()/2;
			//System.out.println("Index : "+ index);
			//System.out.println("Half : " + half);
			
			if(deq.peekFirst() == q.peek()) {
				//System.out.println("====같은====");
				//System.out.println("덱 : "+deq.peekFirst());
				//System.out.println("QU : "+q.peek());
				deq.pollFirst();
				q.poll();
				M--;
				N--;
			}
			else {
				
				if(index <= half) {
					for(int i=0;i<index;i++) {
						deq.offerLast(deq.pollFirst());
						count++;
					}
					
				}else {
					for(int i=0;i<deq.size()-index;i++) {
						deq.offerFirst(deq.pollLast());
						count++;
					}
					
				}
				
				
			}
		}
		System.out.println(count);

	}

}
