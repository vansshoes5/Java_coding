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
	
	static int N;
	static int[][] matrix;
	
	private static int[][] power(int[][] mat, long b) {
		
		//지수가 1이면 그냥 매개변수로 입력된 행렬 반환
		if(b==1) {
			return mat;
		}
		
		// 2 이상인 경우
		else {
			// 지수를 2로 나눈 행렬을 temp에 대입
			int[][] temp = power(mat, b/2);
			
			
			//그리고 해당 행렬을 제곱한다.
			temp = up(temp, temp);
			
			//지수가 홀수라면, 따로 한 번 더 곱해주기.
			if(b %2==1) {
				temp = up(temp, matrix);
			}
			
			// 최종 결과물 반환
			return temp;
		}
		
		
	}
	
	private static int[][] up(int[][] a, int[][] b){
		
		int[][] result = new int[N][N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				for(int k=0;k<N;k++) {
					result[i][j] += a[i][k]*b[k][j];
					result[i][j] %= 1000;
				}
			}
		}
		
		return result;
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(stk.nextToken());
		long B = Long.parseLong(stk.nextToken());
		
		matrix = new int[N+1][N+1];
		
		for(int i=0;i<N;i++) {
			stk = new StringTokenizer(bf.readLine());
			for(int j=0;j<N;j++) {
				matrix[i][j] = Integer.parseInt(stk.nextToken());
				matrix[i][j] %= 1000;
			}
		}
		
		int[][] end = power(matrix, B);
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				sb.append(end[i][j]+" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}
