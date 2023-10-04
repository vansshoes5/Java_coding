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
		Scanner sc = new Scanner(System.in);
		//StringBuilder sb = new StringBuilder();
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		
		BigInteger a = new BigInteger(stk.nextToken());
		BigInteger b = new BigInteger(stk.nextToken());
		
		System.out.println(a.add(b));
		
		
		
		
		
	}

}
