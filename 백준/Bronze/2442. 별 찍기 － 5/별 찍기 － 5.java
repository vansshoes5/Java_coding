import java.io.*;
import java.util.*;
import java.math.*;



public class Main {
	
	static int dp[];
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				sb.append(" ");
			}
			for(int k=0;k<(i*2)-1;k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		
		
	}

}
