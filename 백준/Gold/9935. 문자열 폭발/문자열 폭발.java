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
		StringBuilder sb;
		
		String str = bf.readLine();
		//char[] list = str.toCharArray();
		String bomb = bf.readLine();
				
		Stack<Character> stack = new Stack<>();
		
		int len=0;
		
		for(char c: str.toCharArray()) {
			
			stack.push(c);
			len = stack.size();
			if(len>=bomb.length()) {
				
				boolean flag = true;
				
				int j=bomb.length()-1;
				for(int i=stack.size()-1;i>=stack.size()-bomb.length();i--) {
					
					if(stack.elementAt(i) != bomb.charAt(j)) {
						flag = false;
                        break;
					}
					j--;
				}
								
				//System.out.println(text);
				if(flag) {
					for(int i=0;i<bomb.length();i++) {
						stack.pop();
					}
				}
			}
		}
		
		sb = new StringBuilder();
		if(stack.empty()) {
			System.out.println("FRULA");
			return;
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		System.out.println(sb.reverse());
		
		
	}

}
