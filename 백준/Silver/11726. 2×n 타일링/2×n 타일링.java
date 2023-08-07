import java.io.*;
import java.util.*;
import java.math.*;

/*
 * 행렬제곱
 * 
 * 	1. N - int, B - long
 *  2. 원소 - 0~1,000
 *  3. 메소드 정리
 *  		power : 행렬을 몇 번 곱할 것인지, 그리고 곱한 행렬을 반환해주는 메소드
 *  				입력된 B의 값이 짝수일 경우, 짝수 횟수에 맞게 제곱을 해주면 되는데
 *  									홀수일 경우, 따로 한 번 더 곱해주어야 한다.
 *  					ex) 2''4 = 2''2 x 2''2
 *  					ex) 2''5 = 2''4 x 2
 *  
 *  
 *  		up : 행렬과 행렬을 곱해주고 반환하는 메소드
 *  				단, 각 원소는 항상 1,000으로 나누어준다.
 * */

public class Main {
	
	static int[] dp;
	
	static int mod = 10007;
	
	private static int square(int n) {
		
		for(int i=3;i<=n;i++) {
			dp[i] = dp[i-1]+dp[i-2];
			dp[i] %= mod;
		}
		
		return dp[n];
	}
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		dp = new int[1001];
		
		dp[1] = 1;
		dp[2] = 2;
		
		int result = square(N);
		
		System.out.println(result);
	}

}
