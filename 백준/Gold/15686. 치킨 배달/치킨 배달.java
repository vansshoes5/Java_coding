import java.io.*;
import java.util.*;

/*
 *  치킨을 배달합시다😆
 *  
 *  치킨 거리 구하기
 *  
 *   1. 치킨집의 위치, 집의 위치를 각각 2차원 리스트에 삽입
 *   	1) 추가로 치킨집 방문 확인을 위해 boolean 리스트 생성
 *   2. 최대 13개의 치킨집 중 M개만 고르기 위해 백트래킹을 이용한 차례대로 고르기
 *   	1) 해당 인덱스에 방문할 땐 true, 방문이 끝나면 false
 *   3. M==C(고른 치킨집의 수) 일 때, 치킨 거리 구하기
 *   
 *   치킨 거리
 *   	1) 각 집들로부터 가까운 치킨 거리를 구한다.
 *   	2) 더 짧은 거리가 나오면 최솟값 교체
 *   	3) 각 M개의 치킨집에서 더 짧은 치킨거리가 나오면 최솟값 교체.
 *  
 * */

public class Main {
	
	static int count=0;
	static int[][] chicken = new int[14][3];
	static int[][] street;
	static boolean vista[] = new boolean[14];
	static int length=Integer.MAX_VALUE, m;
	
	public static void calc() {
		
		int a=0;
		
		for(int i=1;i<street.length;i++) {
			
			if(street[i][1]==0 && street[i][2]==0) break;
			int min=Integer.MAX_VALUE;
			for(int j=1;j<chicken.length;j++) {
				//if(chicken[j][1]==0 && chicken[j][2]==0) break;
				
				if(vista[j]) {
					
					//System.out.println("Opened :"+chicken[j][1]+", "+chicken[j][2]);
					int compare = Math.abs(street[i][1]-chicken[j][1])+Math.abs(street[i][2]-chicken[j][2]);
					min = Math.min(min, compare);
					//System.out.println("("+street[i][1]+", "+street[i][2]+") -> ("+chicken[j][1]+", "+chicken[j][2]+") : "+min);
					//System.out.println("min : "+min);
				}
			}
			//System.out.println("min : "+min);
			
			a += min;
			//System.out.println("A : "+a);
		}
		//System.out.println("a : "+a+", length : "+length);
		length = Math.min(length, a);
		//System.out.println("end Length : "+length);
	}
	
	public static void search(int index, int temp) {
		
		if(temp==m) {
			//System.out.println("====");
			calc();
		}
		for(int i=index;i<chicken.length;i++) {
			
			if(!vista[i] && (chicken[i][1]!=0 && chicken[i][2]!=0)) {
				vista[i] = true;
				search(i, temp+1);
				vista[i] = false;
			}
		}
		
		
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(stk.nextToken());
		m = Integer.parseInt(stk.nextToken());
		
		street = new int[n*2+1][3];
		vista[0] = false;
		
		
		int c=1;
		int h=1;
		
		for(int i=1;i<=n;i++) {
			stk = new StringTokenizer(bf.readLine());
			for(int j=1;j<=n;j++) {
				int point = Integer.parseInt(stk.nextToken());
				if(point==1) {
					//System.out.println("가정집 :"+i+", "+j);
					street[h][1] = i; street[h++][2]= j;
				}else if(point==2) {
					//System.out.println("치킨집 :"+i+", "+j);
					//System.out.println("c : "+c);
					chicken[c][1] = i;
					chicken[c][2] = j;
					vista[c++] = false;
				}
			}
		}
		
		/*for(int i=1;i<vista.length;i++) {
			System.out.println(vista[i]);
		}*/
		
		
		search(1, 0);
		
		System.out.println(length);
		
	}

}
