import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringTokenizer stk;
		
		int[] odd = new int[4];
		
		
		
		for(int i=0;i<N;i++) {
			stk = new StringTokenizer(bf.readLine(), " ");
			int x = Integer.parseInt(stk.nextToken());
			int y = Integer.parseInt(stk.nextToken());
			
			y = y%4;
			if (y==0) y =4;
			int result = ((int)Math.pow(x, y))%10;
			if(result==0) System.out.println(10);
			else System.out.println(result);
			
		}

	}

}
