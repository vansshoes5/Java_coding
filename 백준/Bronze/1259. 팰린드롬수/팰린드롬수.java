import java.io.*;
import java.util.*;
import java.math.*;

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
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String num = bf.readLine();
			if(num.equals("0")) {
				break;
			}
			int count=0;
			for(int i=0;i<=num.length()/2;i++) {
				//sb.append(num.charAt(i));
				if(num.charAt(i)!=num.charAt(num.length()-1-i)) {
					count = 1;
				}
			}
			sb.append(count==1?"no":"yes");
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}
