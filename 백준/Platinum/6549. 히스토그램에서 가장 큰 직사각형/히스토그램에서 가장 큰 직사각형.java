import java.io.*;
import java.util.*;
import java.math.*;
import java.time.*;

/*
 *  히스토그램 직사각형
 *  
 *  1. 분할정복
 *  
 *  	정확히는.. 이분 탐색의 느낌이 더 강해보임
 *  
 *  2. 스택
 *  
 *  	인덱스 번호를 스택에 저장해 활용하는 알고리즘
 *  	
 *  
 *  3. 세그먼트 트리-----
 *  
 *  	나중에 꼭 공부해볼 것
 * */

public class Main {
	
	//초기 히스토그램 배열
	static long[] his;
	
	//
	private static long histogram(int n) {
		
		Stack<Integer> stack = new Stack<Integer>();
		long max=0;
		
		for(int i=0;i<n;i++) {
			
			while((!stack.isEmpty()) && his[stack.peek()] >= his[i]) {
				
				long height = his[stack.pop()];
				long width = stack.isEmpty() ? i : i-1 - stack.peek();
				//System.out.println("h : "+ height + " w : "+width);
				
				//최댓값 갱신
				max = Math.max(max, width*height);
				
			}
			
			stack.push(i);
			
		}
		
		while(!stack.isEmpty()) {
			long height = his[stack.pop()];
			long width = stack.isEmpty() ? n : n-1 - stack.peek();
			//System.out.println("h : "+ height + " w : "+width);
			
			max = Math.max(max, width*height);
		}
		
		return max;
		
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		
		//0이 입력되기 전까지 무한 반복
		while(true) {
			StringTokenizer stk = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(stk.nextToken());
			if(n==0) {
				
				//0 입력되면 빠져나오기
				break;
			}
			
			//히스토그램 배열
			his = new long[n];
			for(int i=0;i<n;i++) {
				his[i] = Long.parseLong(stk.nextToken());
			}
			
			
			sb.append(histogram(n)).append("\n");
			
			
		}
		System.out.println(sb);
		
	}

}
