import java.io.*;
import java.util.*;

public class Main {
	
	static long[] arr;
	
	private static long fury(int n) {
		
		arr[1] = 1;
		arr[2] = 2;
		for(int i=3;i<arr.length;i++) {
			arr[i] = (arr[i-1]+arr[i-2])%15746;
		}
		
		return arr[n];
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		//StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(bf.readLine());
		arr = new long[1000001];
		System.out.println(fury(N));
		
	}

}
