import java.io.*;
import java.util.*;

public class Main {
	
	private static void may(ArrayList<Integer> arr, int N, int M, StringBuilder sb, int i) {
		
		if(arr.size()==M) {
			
			for(int j:arr) sb.append(j).append(" ");
			sb.append("\n");
			return;
		}
		
		for(int j=i;j<=N;j++) {
			
			if(!arr.contains(j)) {
				arr.add(j);
				may(arr, N, M, sb, j+1);
				arr.remove(arr.size()-1);
			}
		}
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(bf.readLine(), " ");
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		ArrayList<Integer> ar = new ArrayList<>();
		
		//int[] arr = new int[N];
		StringBuilder sb = new StringBuilder(); 
		
		may(ar, N, M, sb, 1);
		
		System.out.println(sb);

	}

}
