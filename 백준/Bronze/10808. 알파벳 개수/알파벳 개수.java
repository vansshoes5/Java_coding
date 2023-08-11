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
		String str = bf.readLine();
		StringBuilder sb = new StringBuilder();
		int[] alpha = new int[27];
		
		for(int i=0;i<str.length();i++) {
			alpha[str.charAt(i)-96]++;
		}
		for(int i=1;i<alpha.length;i++) {
			sb.append(alpha[i]+" ");
		}
		System.out.println(sb);
		//System.out.println(str.charAt(3)-96);
		
	}

}
