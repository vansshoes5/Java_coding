import java.io.*;
import java.util.*;

public class Main {
	
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk/* = new StringTokenizer(bf.readLine())*/;
		
		int n = Integer.parseInt(bf.readLine());
		int[][] rooms = new int[n+1][3];
		
		
		for(int i=1;i<=n;i++) {
			stk = new StringTokenizer(bf.readLine());
			rooms[i][1] = Integer.parseInt(stk.nextToken());
			rooms[i][2] = Integer.parseInt(stk.nextToken());
			
		}
		
		Arrays.sort(rooms, new Comparator<int[]>() {
			@Override
			public int compare(int[] s1, int[] s2) {
				
				if(s1[2] == s2[2]) {
					return s1[1] - s2[1];
				}
				return s1[2]-s2[2];
			}
		});
		
		int result = 0;
		int time = 0;
		
		for(int i=1;i<=n;i++) {
			
			if(time<=rooms[i][1]) {
				time = rooms[i][2];
				result++;
			}
			
		}
		
	/*	for(int i=n;i>0;i--) {
			
			if(rooms[i][2]<time) {
				//System.out.println("room2 : "+rooms[i][2]);
				time = rooms[i][1];
				result++;
			}
		}*/
		System.out.println(result);
		
	}

}
