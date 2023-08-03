import java.util.*;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;


public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		
		StringTokenizer stk;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		stk = new StringTokenizer(bf.readLine(), " ");
		int num1 = Integer.parseInt(stk.nextToken());
		int num2 = Integer.parseInt(stk.nextToken());
		if(num2==0) {
			return;
		}
		double result = (double)num1/(double)num2;
		
		System.out.println(result);
	}

}
