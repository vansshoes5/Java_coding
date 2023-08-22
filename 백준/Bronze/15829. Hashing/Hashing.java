import java.io.*;
import java.util.*;
import java.math.*;
import java.time.*;

/*
 *  
 * */

public class Main {
	
	static long mod = 1234567891;
	
	private static long hash(char[] st, int i) {
		
		//int x = st[i]-96;
		long result = st[i]-96;
		if(i<1) {
			return result%mod;
		}
		for(int j=1;j<=i;j++) {
			result = result*31;
			result %= mod;
		}
		
		return result%mod;
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(bf.readLine());
		char[] string = bf.readLine().toCharArray();
		
		long result = 0;
		
		for(int i=0;i<n;i++) {
			//System.out.println(string[i]-96);
			result += hash(string, i);
		}
		
		result %= mod;
		System.out.println(result);
	}

}
