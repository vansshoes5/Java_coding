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
		Stack<Integer> st = new Stack<>();
		
		int n = sc.nextInt();
		
		
		
		for(int i=0;i<n;i++) {
			int input = sc.nextInt();
			if(input==1) {
				int x = sc.nextInt();
				st.add(x);
			}else if(input==2) {
				if(st.empty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(st.pop()).append("\n");
				}
			}else if(input==3) {
				sb.append(st.size()).append("\n");
			}else if(input==4) {
				if(st.empty()) {
					sb.append(1);
				}else {
					sb.append(0);
				}
				sb.append("\n");
			}else {
				if(st.empty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(st.peek()).append("\n");
				}
			}
		}
		
		System.out.println(sb);
		
	}

}
