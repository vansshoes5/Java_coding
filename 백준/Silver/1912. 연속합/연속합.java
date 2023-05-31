import java.io.*;
import java.util.*;

public class Main {
	

	/*
	 * 5
	 * -1 -2 -3 -4 -5
	 * -1 : -1, -3, -6, -10, -15
	 * 		0, 0/1, 0/1/2, 0/1/2/3, 0/1/2/3/4
	 * -2 : -2, -5, -9, -14
	 * -3 : -3, -7, -12*/
	/*
	 * 누적합.. 
	 * 1) 1~N까지 더한 경우의 수로 해보았는데 시간/메모리 초과
	 * 2) 1번째 인덱스부터 시작해, (누적합+현재 인덱스)와 현재 인덱스 값을 비교해
	 * 	   해당 누적합에 적용시키는 방법
	 * 		ex) 0번째+1번째 & 1번째 인덱스 값 중 높은 값을 1번째 누적합에 저장하기
	 * 			그럼 2번째 누적합은 1번째 누적합+2번째 인덱스 & 2번째 인덱스 중 높은 값을 저장하겠지?
	 * 
	 * 조건 : hap[0] == arr[0]
	 * */

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		//StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(bf.readLine());
		
		int[] arr = new int[N];
		int[] hap = new int[N];
		stk = new StringTokenizer(bf.readLine(), " ");
		
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		int max = arr[0];
		hap[0] = arr[0];
		
		for(int i=1;i<N;i++) {
			hap[i] = Math.max(hap[i-1]+arr[i], arr[i]);
			max = Math.max(max, hap[i]);
		}
		System.out.println(max);
		
	}

}
