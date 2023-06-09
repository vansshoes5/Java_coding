import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] s = bf.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int c = Integer.parseInt(s[2]);
		int d = Integer.parseInt(s[3]);
		int e = Integer.parseInt(s[4]);
		int f = Integer.parseInt(s[5]);
		//System.out.println("a: "+a+" b: "+b+" c: "+c+" d: "+d+" e: "+e+" f: "+f);
		int x=(c*e-b*f)/(a*e-b*d); 
		int y=(c*d-a*f)/(b*d-a*e);
	
		System.out.println(x+" "+y);
		
		
		
	}

}
