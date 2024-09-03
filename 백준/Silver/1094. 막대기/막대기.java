import java.io.*;
import java.util.*;
import java.math.BigInteger;

/*
 *  SWEA
 *  
 *  
 *  
 *  
 *  
 * */

public class Main {
	
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		
		//System.out.print("input tc: ");
		
		int n = 64;
		int x = Integer.parseInt(bf.readLine());
		int j=0;
		
		int count=0;
		
		while(x>0) {
			if(n>x) {
				n = n/2;
			}
			else {
				x = x-n;
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}

}
