import java.io.*;
import java.util.*;
import java.math.*;



public class Main {
	

	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String sentence = bf.readLine();
		StringBuilder sb = new StringBuilder();
		
		char[] sen = sentence.toCharArray();
		for(int i=0;i<sen.length;i++) {
			sb.append(sen[i]);
			if(i%10==9) {
				sb.append("\n");
			}
		}
		System.out.println(sb);
		
	}

}
