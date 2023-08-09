import java.io.*;
import java.util.*;
import java.math.*;



public class Main {
	

	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//int N = Integer.parseInt(bf.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		
		int doremi[] = new int[8];
		doremi[0] = Integer.parseInt(stk.nextToken());
		int count=0;
		for(int i=1;i<8;i++) {
			doremi[i] = Integer.parseInt(stk.nextToken());
			if(doremi[i]-1 == doremi[i-1]) {
				count++;
			}
			else if(doremi[i]+1 == doremi[i-1]) {
				count--;
			}
			
		}
		if(count==7) {
			sb.append("ascending");
		}else if(count== -7) {
			sb.append("descending");
		}else {
			sb.append("mixed");
		}
		
		System.out.println(sb);
		
		
	}

}
