import java.io.*;
import java.util.*;

public class Main {
	
	static int count=0;
	
	private static void may(ArrayList<Integer> arr, int N, int row) {
		
		if(row==N) {
			//System.out.println("Man");
			count++;
			return;
		}
		
		for(int j=0;j<N;j++) {
			
			if(queen(arr, j, row)) {
				//System.out.println("Check!");
				arr.add(j);
				may(arr, N, row+1);
				arr.remove(arr.size()-1);
			}
			
		}
	}
	
	//퀸이 들어갈 자리가 있는지 없는지 검사하기
	private static boolean queen(ArrayList<Integer> arr, int column, int row) {
		
		for(int k=0;k<row;k++) {
			if(arr.get(k)==column || Math.abs(arr.get(k)-column)==row-k) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		ArrayList<Integer> chess = new ArrayList<>();
		//int count = 0;
		may(chess, N, 0);
		
		System.out.println(count);
	}

}
