import java.io.*;
import java.util.*;

public class Main {
	
	private static long pactorial(int n) {
		
		if(n<2) {
			return 1;
		}
		return n*pactorial(n-1);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		System.out.println(pactorial(N));

	}
	
	

}
