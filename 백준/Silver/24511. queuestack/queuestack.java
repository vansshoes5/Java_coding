import java.io.*;
import java.util.*;
import java.math.*;
import java.time.*;

/*
 *  QueueStack
 *  
 *  1. 큐와 스택인지 구분하기
 *  2. 큐의 특징
 *  	들어오는 게 있으면, 기존에 있던 게 나간다.
 *  3. 스택의 특징
 *  	들어오는 게 있으면, 들어온 게 나간다.
 *  	-> 스택은 그냥 무시해도 됨.
 *  
 *  4. LinkedList에서,
 *  	큐로 연결된 원소들 하나씩 POP 하기
 *  	
 * */

public class Main {
	
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(bf.readLine());
		
		LinkedList<Integer> que = new LinkedList<>();
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		StringTokenizer num = new StringTokenizer(bf.readLine());
		
		for(int i=0;i<n;i++) {
			
			int temp = Integer.parseInt(num.nextToken());
			int qs = Integer.parseInt(stk.nextToken());
			if(qs==0) {
				que.add(temp);
			}
			
		}
		int m = Integer.parseInt(bf.readLine());
		num = new StringTokenizer(bf.readLine());
		for(int i=0;i<m;i++) {
			
			int element = Integer.parseInt(num.nextToken());
			que.offerFirst(element);
			sb.append(que.pollLast()).append(" ");
			
		}


		
		System.out.println(sb);

	}

}
