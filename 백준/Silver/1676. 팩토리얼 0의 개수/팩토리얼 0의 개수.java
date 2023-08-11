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
		
		//long[] fibo = new long[91];
		
		int N = Integer.parseInt(bf.readLine());
		
		int count=0;
		
		while(N>0) {
			count = count+N/5;
			N/=5;
		}
		
		System.out.println(count);
	}

}
