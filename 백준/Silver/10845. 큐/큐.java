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
		//Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> qu = new LinkedList<>();
		int x=0;
		for(int i=0;i<n;i++) {
			StringTokenizer stk = new StringTokenizer(bf.readLine());
			switch(stk.nextToken()) {
			case "push":
				x = Integer.parseInt(stk.nextToken());
				qu.add(x);
				break;
			case "pop":
				if(qu.isEmpty()) {
					System.out.println(-1);
					
				}else {
					System.out.println(qu.poll());
				}
				break;
			case "size":
				System.out.println(qu.size());
				break;
			case "empty":
				if(qu.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				break;
			case "front":
				if(qu.isEmpty()) {
					System.out.println(-1);
					
				}else {
					System.out.println(qu.peek());
				}
				break;
			case "back":
				if(qu.isEmpty()) {
					System.out.println(-1);
					
				}else {
					System.out.println(x);
				}
				break;
			}
		}
		
	}

}
