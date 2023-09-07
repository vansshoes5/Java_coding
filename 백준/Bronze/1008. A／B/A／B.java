import java.io.*;
import java.util.*;
import java.math.*;
import java.time.*;

/*
 *  
 * */

public class Main {
	
	
	
	//
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		
		float a = Float.parseFloat(stk.nextToken());
		float b = Float.parseFloat(stk.nextToken());
		
		if(b==0) {
			return;
		}
		System.out.println(a/(double)b);
		
		
		
	}

}
