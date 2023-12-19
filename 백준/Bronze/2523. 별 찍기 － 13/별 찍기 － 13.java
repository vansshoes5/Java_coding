import java.io.*;
import java.util.*;

/*
 *  
 *  
 *  
 * */

public class Main {
	
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		//input
		int n= Integer.parseInt(bf.readLine());
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
