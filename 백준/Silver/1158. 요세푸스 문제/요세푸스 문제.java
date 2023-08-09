import java.io.*;
import java.util.*;
import java.math.*;



public class Main {
	

	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(stk.nextToken());
		int k = Integer.parseInt(stk.nextToken());
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		Queue<Integer> qu = new LinkedList<>();
		
		for(int i=1;i<=n;i++) {
			qu.add(i);
		}
		int count=1;
		while(!qu.isEmpty()) {
			if(count==k) {
				sb.append(qu.poll()).append(", ");
				count=1;
			}else{
				qu.add(qu.poll());
				count++;
			}
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append(">");
		System.out.println(sb);
		
	}

}
