import java.io.*;
import java.util.*;

public class Main {
	
	static int op[] = new int[4];
	static int[] arr;
	
	private static void cal(int n, int index, int[] size) {
		if(index == arr.length) {
			//System.out.println("hap: "+n);
			size[0] = Math.max(size[0], n);
			size[1] = Math.min(size[1], n);
			return;
		}
		
		for(int i=0;i<4;i++) {
			if(op[i]>0) {
				op[i]--;
				if(i==0) {
					cal(n+arr[index], index+1, size);
				}
				else if(i==1) {
					cal(n-arr[index], index+1, size);
				}
				else if(i==2) {
					cal(n*arr[index], index+1, size);
				}
				else if(i==3) {
					cal(n/arr[index], index+1, size);
				}
				
				op[i]++;
			}
		}
		
		
		
	}
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> result = new ArrayList<>();
		
		//number of numbers
		int N = Integer.parseInt(bf.readLine());
		
		//max, min
		int mm[] = new int[2];
		mm[0] = Integer.MIN_VALUE;
		mm[1] = Integer.MAX_VALUE;
		
		//array
		arr = new int[N];
		StringTokenizer stk = new StringTokenizer(bf.readLine(), " ");
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		
		//number of operators
		stk = new StringTokenizer(bf.readLine(), " ");
		for(int i=0;i<4;i++) {
			op[i] = Integer.parseInt(stk.nextToken());
		}
		
		cal(arr[0], 1, mm);
		
		StringBuilder sb = new StringBuilder();
		sb.append(mm[0]).append("\n").append(mm[1]);
		System.out.println(sb);
		
		
	}

}
