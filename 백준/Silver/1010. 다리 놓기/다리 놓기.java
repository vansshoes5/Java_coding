import java.util.*;
import java.io.*;

/*
 * 조합론!
 * */

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		
		
		
		int[][] bottom = new int[30][30];
		for(int i=0;i<30;i++) {
			bottom[i][i] = 1;
			bottom[i][0] = 1;
		}
		
		for(int i=2;i<30;i++) {
			for(int j=1;j<30;j++) {
				bottom[i][j] = bottom[i-1][j-1] + bottom[i-1][j];
			}
		}
		StringBuilder sb = new StringBuilder();
		int test = Integer.parseInt(bf.readLine());
		
		
		for(int i=0;i<test;i++) {
			stk = new StringTokenizer(bf.readLine(), " ");
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			sb.append(bottom[b][a]).append("\n");
			//System.out.println(combinate(b, a));
		}
		System.out.println(sb);

	}

}
