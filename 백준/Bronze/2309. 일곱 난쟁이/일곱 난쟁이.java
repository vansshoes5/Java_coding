import java.io.*;
import java.util.*;
import java.math.*;
import java.time.*;

/*
 *  7난쟁이
 *  
 *  1. 9명 중 키의 합이 100으로 맞아떨어지는 7명
 *  2. 
 * */

public class Main {
	
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int[] height = new int[9];
		int total=0;
		
		for(int i=0;i<9;i++) {
			height[i] = Integer.parseInt(bf.readLine());
			total += height[i];
		}
		//Arrays.sort(height);
		
		for(int i=0;i<9;i++) {
			total -= height[i];
			boolean flag = true;
			for(int j=0;j<9;j++) {
				if(j!=i) {
					total -= height[j];
					if(total == 100) {
						height[i] = 0;
						height[j] = 0;
						flag = false;
						break;
					}else {
						total += height[j];
					}
				}
			}
			if(flag == false) {
				break;
			}
			total+=height[i];
		}
		Arrays.sort(height);
		
		
		for(int i=0;i<9;i++) {
			if(height[i]!=0) {
				sb.append(height[i]).append("\n");
			}
		}
		
		System.out.println(sb);
		
	}

}
