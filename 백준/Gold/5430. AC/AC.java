import java.io.*;
import java.util.*;

public class Main {
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> qu;
		StringBuilder sb = new StringBuilder();
		StringTokenizer stk;
		
		int T = Integer.parseInt(bf.readLine());
		
		for(int i=0;i<T;i++) {
			int errorPoint = 0;
			String order = bf.readLine();
			int n = Integer.parseInt(bf.readLine());
			String numbers = bf.readLine();
			
			stk = new StringTokenizer(numbers, "[],");
			
			qu = new LinkedList<>();
			
			for(int j=0;j<n;j++) {
				qu.addLast(Integer.parseInt(stk.nextToken()));
			}
			int R = 0;
			
			
			for(int j=0;j<order.length();j++) {
				if(order.charAt(j)=='R') {
					R++;
				}else {
					if(qu.size()==0) {
						errorPoint = 1;
						
					}
					else {
						if(R%2==0) {
							qu.pollFirst();
						}else {
							qu.pollLast();
						}
						
						//System.out.println(qu);
					}
				}
			}
			
			if(errorPoint == 1) {
				sb.append("error");
			}else {
				sb.append("[");
				
				if(qu.size()>0) {
				
				if(R%2==0) {
					sb.append(qu.pollFirst());
					while(!qu.isEmpty()) {
						
						sb.append(',').append(qu.pollFirst());
					}
				}else {
					sb.append(qu.pollLast());
					while(!qu.isEmpty()) {
						
						sb.append(',').append(qu.pollLast());
					}
				}
				}
				sb.append("]");
			}
			sb.append("\n");
			
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);

	}
	
	

}
