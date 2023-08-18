import java.io.*;
import java.util.*;
import java.math.*;
import java.time.*;

/*
 *  
 * */

public class Main {
	
	public static int n=0;
	public static int c=0;
	public static String code = "";
	public static char[] list;
	public static char[] code_2;
	
	private static void make(int i) {
		
		try {
			if(code.length()==n) {
				if(vowel()) {
					
					//sb.append(code).append("\n");
					System.out.println(code);
					//System.out.println("upload!");
					//System.out.println("+: "+code);
					
				}
				//code = "";
				return;
			}
			
			for(int j=i;j<c;j++) {
				//System.out.println(" j : "+list[j]);
				code += String.valueOf(list[j]);
				//code_2[index] = list[j];
				//System.out.println("code : "+ code);
				make(j+1);
				if(code != null) {
					code = code.substring(0, code.length()-1);
				}else {
					code = "";
				}
				
			}
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}
	
	private static boolean vowel() {
		int a=0, b=0;
		try {
			
			
			for(char c : code.toCharArray()) {
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					a++;
				}else {
					b++;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		
		if(a>=1 && b>=2) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		//StringBuilder sb = new StringBuilder();
		
		//n = sc.nextInt();
		//c = sc.nextInt();
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		
		n = Integer.parseInt(stk.nextToken());
		c = Integer.parseInt(stk.nextToken());
		
		stk = new StringTokenizer(bf.readLine());
		
		try {
			list = new char[c];
			//code_2 = new char[n];
			for(int i=0;i<c;i++) {
				list[i] = stk.nextToken().charAt(0);
			}
			
			Arrays.sort(list);
			
			
			make(0);
		}catch(NullPointerException e) {
			e.printStackTrace();
			throw e;
		}
		
		
		
		//sb.delete(sb.length()-1, sb.length());
		//System.out.println(sb);
	}

}
