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
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		int[] ar = new int[3];
		for(int i=0;i<3;i++) {
			ar[i] = Integer.parseInt(stk.nextToken());
		}
		
		Arrays.sort(ar);
		System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);
		
		
	}

}
