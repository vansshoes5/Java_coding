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
		
		int n = Integer.parseInt(bf.readLine());
		int[] hap = new int[n+1];
		
		for(int i=1;i<=n;i++) {
			hap[i] =i;
			//System.out.println(i+": "+hap); 
		}
		
		for(int i=2;i<=n;i++) {
			
			for(int j=1;j*j<=i;j++) {
				hap[i] = Math.min(hap[i], hap[i-j*j]+1);
			}			
		}
		
		System.out.println(hap[n]);
		
		
	}

}
