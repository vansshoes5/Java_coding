import java.io.*;
import java.util.*;
import java.math.*;



public class Main {
	
	
	
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int[] scores = new int[3];
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		
		scores[0] = Integer.parseInt(stk.nextToken());
		scores[1] = Integer.parseInt(stk.nextToken());
		scores[2] = Integer.parseInt(stk.nextToken());
		
		Arrays.sort(scores);
		System.out.println(scores[1]);
		
	}

}
