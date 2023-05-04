import java.io.*;
import java.util.*;

public class Main {
	
	private static int count=0;
	private static int mr_K;
	private static int save;
	private static int[] temp;
	
	private static void merge_sort(int[] arr, int L, int R) {
		
		if(L==R) {
			return;
		}
		int mid = (L+R)/2;
		
		merge_sort(arr, L, mid);
		merge_sort(arr, mid+1, R);
		merge(arr, L, mid, R);
		
	}
	private static void merge(int[] arr, int left, int mid, int right) {
		int i = left;
		int j = mid+1;
		int t = 0;
		
		
		
		while(i<=mid && j <= right) {
			if(arr[i] <= arr[j]) {
				
				
				temp[t++] = arr[i++];
				count++;
				
			}else {
				temp[t++] = arr[j++];
				count++;
			}
			if(count==mr_K) {
				
				save = temp[t-1];
				return;
			}
		}
		
		while(i<=mid) {
			temp[t++] = arr[i++];
			count++;
			if(count==mr_K) {
				
				save = temp[t-1];
				return;
			}
		}
			
		
		while(j<=right) {
			temp[t++] = arr[j++];
			count++;
			if(count==mr_K) {
				
				save = temp[t-1];
				return;
			}
		}
			
		i = left; t=0;
		while(i<=right) {
			arr[i++] = temp[t++];
		}
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer stk = new StringTokenizer(bf.readLine(), " ");
		int N = Integer.parseInt(stk.nextToken());
		int K = Integer.parseInt(stk.nextToken());
		mr_K = K;
		
		int[] arr = new int[N];
		temp = new int[N];
		stk = new StringTokenizer(bf.readLine(), " ");
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		
		merge_sort(arr, 0, N-1);
		
		
		
		//System.out.println(sb);
		//System.out.println("count : "+count);
		//System.out.println("K :"+K);
		save = count>=K ? save : -1;
		sb.append(save);
		System.out.println(sb);
	}
	
	

}
