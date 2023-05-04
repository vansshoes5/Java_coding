import java.io.*;
import java.util.*;

public class Main {
	
	private static void cantor(int i, int j, int n, StringBuilder sb) {
		
		if((i/n)%3==1 && (j/n)%3==1) {
			sb.append(" ");
		}else {
			if(n/3==0) {
				sb.append("*");
			}else {
				cantor(i, j, n/3, sb);
			}
		}
		
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = bf.readLine();
		int N = Integer.parseInt(str);
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++
					) {
				cantor(i, j, N, sb);
			}
			sb.append("\n");
		}
		System.out.println(sb);

	}
	
	

}
