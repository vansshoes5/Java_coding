import java.io.*;
import java.util.*;

public class Main {
	
	private static void cantor(int i, int n, StringBuilder sb) {
		
		if((i/n)%3==1) {
			sb.append(" ");
		}else {
			if(n/3==0) {
				sb.append("-");
			}else {
				cantor(i, n/3, sb);
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = "";
		while((str=bf.readLine()) !=null && !str.isEmpty()) {
			int N = Integer.parseInt(str);
			int length = (int)Math.pow(3, N);
			for(int i=0;i<length;i++) {
				cantor(i, length, sb);
			}
			sb.append("\n");
		}
		System.out.println(sb);

	}
	
	

}
