import java.io.*;
import java.util.*;

public class Main {
	
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String word = bf.readLine();
		int N = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer stk;
		for(int i=0;i<N;i++) {
			stk = new StringTokenizer(bf.readLine(), " ");
			char alpha = stk.nextToken().charAt(0);
			int b = Integer.parseInt(stk.nextToken());
			int e = Integer.parseInt(stk.nextToken());
			int count = 0;
			for(int j=b;j<=e;j++) {
				if(word.charAt(j) == alpha) {
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
		
	}

}
