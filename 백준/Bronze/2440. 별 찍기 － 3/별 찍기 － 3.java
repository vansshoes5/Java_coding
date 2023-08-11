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
		
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=n;i>0;i--) {
			for(int j=i;j>0;j--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
