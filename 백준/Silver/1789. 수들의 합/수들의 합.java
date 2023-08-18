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
		StringBuilder sb = new StringBuilder();
		
		long s = Long.parseLong(bf.readLine());
		
		//System.out.println();
		long count=0;
		long result=0;
		for(long i=1;i<=s;i++) {
			count +=i;
			result++;
			if(count>s) {
				result-- ;
				break;
			}
		}
		System.out.println(result);
		
	}

}
