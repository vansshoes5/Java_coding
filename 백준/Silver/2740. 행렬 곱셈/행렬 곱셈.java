import java.io.*;
import java.util.*;



public class Main {
	
	static long mod = 1000000007;
	
	/*private static long module(long n, long r) {
		
		
	}*/

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk  = new StringTokenizer(bf.readLine());
		
		//행렬 1
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		int a[][] = new int[N][M];
		
		for(int i=0;i<N;i++) {
			stk = new StringTokenizer(bf.readLine());
			for(int j=0;j<M;j++) {
				a[i][j] = Integer.parseInt(stk.nextToken());
			}
		}
		
		//행렬 2
		stk  = new StringTokenizer(bf.readLine());
		int M2= Integer.parseInt(stk.nextToken());
		int K = Integer.parseInt(stk.nextToken());
		int b[][] = new int[M2][K];
		
		for(int i=0;i<M2;i++) {
			stk = new StringTokenizer(bf.readLine());
			for(int j=0;j<K;j++) {
				b[i][j] = Integer.parseInt(stk.nextToken());
			}
		}
		
		//최종행렬
		int result[][] = new int[N][K];
		for(int i=0;i<K;i++) {
			for(int j=0;j<N;j++) {
				for(int k=0;k<M;k++) {
					result[j][i] += a[j][k]*b[k][i];
				}
			//	System.out.print(result[j][i]+" ");
			}
			//System.out.println();
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<K;j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		//System.out.println();
	}

}
