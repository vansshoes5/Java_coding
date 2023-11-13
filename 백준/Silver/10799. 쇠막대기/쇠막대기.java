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
		
		String str = bf.readLine();
		Stack<Character> dummy = new Stack<>();
		
		char[] pipe = str.toCharArray();
		int result=0;
		
		for(int c=0;c<pipe.length;c++) {
			if(pipe[c]=='(') {
				dummy.add(pipe[c]);
			}
			else if(pipe[c]==')') {
				if(pipe[c-1]=='(') {
					dummy.pop();
					result += dummy.size();
				}else if(pipe[c-1]==')') {
					dummy.pop();
					result += 1;
				}
			}
		}
		
		System.out.println(result);
		
	}

}
