import java.io.*;
import java.util.*;

public class Main {
	
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String form = bf.readLine();
		StringTokenizer stk = new StringTokenizer(form, "+-");
		int[] numbers = new int[stk.countTokens()];
		//System.out.println(stk.countTokens());
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = Integer.parseInt(stk.nextToken());
			//System.out.println(numbers[i]);
		}
		
		stk = new StringTokenizer(form, "0123456789");
		String[] op = new String[stk.countTokens()];
		for(int i=0;i<op.length;i++) {
			op[i] = stk.nextToken();
		}
		
		int hap = numbers[numbers.length-1];
		int result = 0;
		
		for(int i=(numbers.length-2);i>=0;i--) {
			
			if(op[i].equals("-")) {
				hap = -hap;
				result += hap;
				hap=0;
			}
			hap = hap+numbers[i];
		}
		result += hap;
		System.out.println(result);
		
		
		
	}

}
