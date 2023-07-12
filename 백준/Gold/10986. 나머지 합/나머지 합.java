import java.io.*;
import java.util.*;




public class Main {
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		
		int n = Integer.parseInt(stk.nextToken());
		int m = Integer.parseInt(stk.nextToken());
		long count=0;
		
		// add : 수열의 합
		// las : 나머지 Array
		long[] add = new long[n+1];
		long[] las = new long[m];
		
		stk = new StringTokenizer(bf.readLine());
		
		for(int i=1;i<=n;i++) {
			
			//이전 index의 나머지 값 + 현재 입력값
			add[i] = add[i-1]+Integer.parseInt(stk.nextToken());
			add[i] %= m;
			//을 m으로 나눈 나머지
			
			//나머지가 0이라면 count+1
			if(add[i]==0) {
				count++;
			}
			//System.out.println(add[i]);
			
			//나머지 값을 index로 하는 값+1
			las[(int) add[i]]++;
		}
		
		//나머지 배열에 따라
		for(int i=0;i<m;i++) {
			
			//나머지 값>1 이라면, 그 중에서 2개 선택하기
			if(las[i]>1) {
				count += (las[i]*(las[i]-1)/2);
			}
			
			
		}
		
		
		
		
		
		System.out.println(count);
		
	}

}
