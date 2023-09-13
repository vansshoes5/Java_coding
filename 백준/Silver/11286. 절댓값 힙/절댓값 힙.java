import java.io.*;
import java.util.*;
import java.math.*;
import java.time.*;

/*
 *  
 * */

public class Main {
	
	
	
	//
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(bf.readLine());
		//int max = 0;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				int x = Math.abs(o1);
				int y = Math.abs(o2);
				
				if(x==y) {
					if(o1<o2) {
						return -1;
					}else {
						return 1;
					}
				}
				else if(x<y) {
					return -1;
				}else {
					return 1;
				}
			}
		});
		
		while(n>0) {
			int x = Integer.parseInt(bf.readLine());
			if(x!=0) {
				//System.out.println(Math.abs(x));
				pq.add(x);
				
			}
			else {
				if(pq.isEmpty()) {
					sb.append("0");
				}else {
					sb.append(pq.poll());
				}
				sb.append("\n");
			}
			n--;
		}
		
		System.out.println(sb);
		
		
	}

}
