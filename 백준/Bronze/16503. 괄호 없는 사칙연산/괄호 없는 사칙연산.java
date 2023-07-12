import java.io.*;
import java.util.*;


public class Main {
	
	
	
	private static int oper(char ch, int a, int b) {
		
		int result=0;
		
		switch(ch) {
		case '+':
			result = a+b;
			break;
		case '-':
			result = a-b;
			break;
		case '*':
			result = a*b;
			break;
		case '/':
			
			result = a/b;
			break;
		}
		
		return result;
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		
		int[] num = new int[3];
		char[] op = new char[2];
		
		for(int i=0;i<3;i++) {
			num[i] = Integer.parseInt(stk.nextToken());
			if(i==2)	break;
			op[i] = stk.nextToken().charAt(0);
			
		}
		
		int first = oper(op[0], num[0], num[1]);
		first = oper(op[1], first, num[2]);
		
		int second = oper(op[1], num[1], num[2]);
		second = oper(op[0], num[0], second);
		
		if(first>second) {
			System.out.println(second);
			System.out.println(first);
		}else {
			System.out.println(first);
			System.out.println(second);
		}
		
		
		
		
		
	}

}
