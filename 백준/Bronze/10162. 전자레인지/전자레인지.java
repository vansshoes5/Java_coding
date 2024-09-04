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
		//StringTokenizer stk;
		//Scanner sc = new Scanner(System.in);
		
		//System.out.print("input tc: ");
		
		int t = Integer.parseInt(bf.readLine());
		
		int a = 300;
		int b = 60;
		int c = 10;
		
		int alpha = 0;
		int beta = 0;
		int delta = 0;
		
		
		if(t%10!=0) {
			System.out.println(-1);
			return;
		}
		else {
			while(t>0) {
				if(t>=a) {
					t -=a;
					alpha++;
				}else if(t>=b) {
					t -=b;
					beta++;
				}else {
					t -=c;
					delta++;
				}
			}
		}
		System.out.println(alpha+" "+beta+" "+delta);
		
		
		
	}

}
