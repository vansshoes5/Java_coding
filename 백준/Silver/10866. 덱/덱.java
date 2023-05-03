import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(bf.readLine());
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		while(T > 0) {
			
			StringTokenizer stk = new StringTokenizer(bf.readLine(), " ");
			String word = stk.nextToken();
			
			if(word.equals("push_front")) {
                
				int x = Integer.parseInt(stk.nextToken());
				deque.offerFirst(x);
                
			}else if(word.equals("push_back")) {
                
				int x = Integer.parseInt(stk.nextToken());
				deque.offerLast(x);
                
			}
			else if(word.equals("pop_front")) {
                
				if(deque.isEmpty()) {
                    
					System.out.println(-1);
                    
				}else {
					System.out.println(deque.pollFirst());
				}
                
			}
			else if(word.equals("pop_back")) {
                
				if(deque.isEmpty()) {
                    
					System.out.println(-1);
                    
				}else {
					System.out.println(deque.pollLast());
				}
                
			}
			else if(word.equals("size")) {
                
				System.out.println(deque.size());
                
			}
			else if(word.equals("empty")) {
                
				if(deque.isEmpty()) {
                    
					System.out.println(1);
                    
				}else {
                    
					System.out.println(0);
				}
                
			}
			else if(word.equals("front")) {
                
				if(deque.isEmpty()) {
                    
					System.out.println(-1);
                    
				}else {
                    
					System.out.println(deque.peekFirst());
				}
                
			}else {
                
				if(deque.isEmpty()) {
                    
					System.out.println(-1);
                    
				}else {
                    
					System.out.println(deque.peekLast());
				}
                
			}
			T--;
		}
	}

}
