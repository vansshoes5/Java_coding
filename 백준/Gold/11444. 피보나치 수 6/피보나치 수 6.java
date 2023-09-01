import java.io.*;
import java.util.*;
import java.math.*;
import java.time.*;

/*
 *  피보나치 분할
 *  
 *  피보나치를 구현할 수 있는 알고리즘은 정말 다양한데,
 *  그 중 분할정복을 이용하고자 한다면
 *  행렬을 통해 접근해야 한다.
 *  
 *  행렬은 2차원 배열로 선언해 접근한다.
 * */

public class Main {
	
	static long mod = 1000000007;
	
	private static long[][] fibo(long[][] arr1,long n) {
		
		long[][] temp;
		
		if(n<=1) {
			return arr1;
		}
		
		temp = fibo(arr1, n/2);
		
		temp = matrix(temp, temp);
		if(n%2==1) {
			temp = matrix(temp, arr1);
		}
		
		return temp;
		
	}
	
	private static long[][] matrix(long[][] x, long[][] y){
		long[][] array = new long[2][2];
		array[0][0] = (((x[0][0]*y[0][0])%mod)+((x[0][1]*y[1][0])%mod))%mod;
		array[1][0] = (((x[1][0]*y[0][0])%mod)+((x[1][1]*y[1][0])%mod))%mod;
		array[0][1] = (((x[0][0]*y[0][1])%mod)+((x[0][1]*y[1][1])%mod))%mod;
		array[1][1] = (((x[1][0]*y[0][1])%mod)+((x[1][1]*y[1][1])%mod))%mod;
		
		
		return array;
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		
		long n = Long.parseLong(bf.readLine());
		
		long[][] arr1 = {{1, 1}, {1, 0}};
		
		long[][] result = fibo(arr1, n);
		//System.out.println(result[0][0]);
		System.out.println(result[1][0]);
	}

}
