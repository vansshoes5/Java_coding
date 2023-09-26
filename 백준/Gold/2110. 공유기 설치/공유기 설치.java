import java.io.*;
import java.util.*;
import java.math.*;
import java.time.*;

/*
 *  
 * */

public class Main {
	
	static int C, N;
	static int[] house;
	
	
	
	static int lan(int dist) {
		
		//설치 가능한 개수 최소값 = 1
		int result = 1;
		int left=house[0];
		
		/* 두번재 집부터, 왼쪽 집과 자기 자신과의 거리를 구한다.
		 * 그 거리가 전달받은 mid(=dist)보다 크거나 같으면 
		 * 최소거리보다 크기에 설치 가능한 개수를 +1 해준다.
		 * 그리고 자기 자신을 왼쪽 집으로 정한다.
		 * 
		 * dist보다 작으면 카운트하지 않는다.
		 */ 
		for(int i=1;i<N;i++) {
			if(house[i]-left >= dist) {
				result++;
				left = house[i];
			}
		}
		
		//System.out.println("m : "+result);
		return result;
		
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		//StringBuilder sb = new StringBuilder();
		
		N = sc.nextInt();
		C = sc.nextInt();
		
		
		
		house = new int[N];
		for(int i=0;i<N;i++) {
			house[i] = sc.nextInt();
			//max = Math.max(max, house[i]);
		}
		
		//좌표 정렬하기
		Arrays.sort(house);
		
		//최소 거리
		int low = 1;
		
		//최대 거리 : 최댓값 - 최소값
		int high = house[N-1]-house[0]+1;
		
		while(low<high) {
			
			int mid = (low+high)/2;
			//System.out.println("low : "+low+" high : "+high);
			//System.out.println("mid : "+mid);
			
			/* mid 값과 각 집 사이의 거리를 비교하며 카운트하기
			 * lan(mid)의 반환값이 설치할 개수보다 작으면 mid 값을 줄여야하므로 high를 낮춘다.
			 * 크거나 같으면, low값을 높인다.
			 */ 
			if(lan(mid)<C) {
				high = mid;
			}else {
				low = mid+1;
			}
			
			//최종적으로 정해진 low 값에서 1을 빼준다.
		}
		
		System.out.println(low-1);
		
	}

}
