import java.io.*;
import java.util.*;
import java.math.*;
import java.time.*;

/*
 * 연구소 바이러스 막기
 * 
 *  1. 연구소 크기과, 연구소 내부 상태 입력받기
 *  2. 
 * */

public class Main {
	
	
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(bf.readLine());
		
		int[] set = new int[9];
		
		while(num>0) {
			int jelly = num%10;
			if(jelly==9) {
				jelly = 6;
			}
			set[jelly]++;
			num /=10;
		}
		set[6] = set[6]%2==0?set[6]/2:set[6]/2+1;
		int result = set[0];
		for(int i=1;i<set.length;i++) {
			result = Math.max(result, set[i]);
		}
		System.out.println(result);
		
	}

}
