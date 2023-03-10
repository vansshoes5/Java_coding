import java.io.*;
import java.util.*;

/*
 * c체스판 다시 칠하기
 * 
 * 1. 왼쪽 상단이 '흰색'일 경우, 흰색의 인덱스 : */

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(bf.readLine(), " ");
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		
		String[] strArr = new String[N];
		char leftUp = ' ';
		for(int i=0;i<strArr.length;i++) {
			strArr[i] = bf.readLine();
		}
		int min = 64;

		for(int i=0;i<N-7;i++) {
			for(int j=0;j<M-7;j++) {
				leftUp = strArr[i].charAt(j);
				int count = 0;
				System.out.println("왼쪽 상단 : " + leftUp);
				//왼쪽 상단이 홀수일 때
				if((i+j)%2==1) {
					
					//홀수이고, 검정색일 때
					if(leftUp=='B') {
						//System.out.println("x : "+i+" y : "+ j);
						//System.out.println("왼쪽 상단은 홀수, 검정색이다.");
						for(int k=i;k<i+8;k++) {
							for(int l=j;l<j+8;l++) {
								
								//짝수 블록
								if((k+l)%2==0) {
									//짝수 블록이 검정색일 때
									if(strArr[k].charAt(l)!='W') {
										//System.out.println("좌표 : "+k+", "+l+"현재 블록 : "+ strArr[k].charAt(l));
										count++;
									}
									
								}
								//홀수 블록
								else {
									//홀수 블록이 흰색일 때
									if(strArr[k].charAt(l)!='B') {
										//System.out.println("좌표 : "+k+", "+l+"현재 블록 : "+ strArr[k].charAt(l));
										count++;
									}
								}
							}
						}
						//System.out.println("Count : "+ count);
						if(min>count) {
							min = count;
						}
					}
					//홀수이고, 흰색일 때
					else {
						//System.out.println("x : "+i+" y : "+ j);
						//System.out.println("왼쪽 상단은 홀수, 흰색이다.");
						for(int k=i;k<i+8;k++) {
							for(int l=j;l<j+8;l++) {
								
								//홀수 블록
								if((k+l)%2==1) {
									//홀수 블록이 흰색이 아닐 때
									if(strArr[k].charAt(l)!='W') {
										//System.out.println("좌표 : "+k+", "+l+"현재 블록 : "+ strArr[k].charAt(l));
										
										count++;
									}
								}
								//짝수 블록
								else {
									//짝수 블록이 검정색이 아닐 때
									if(strArr[k].charAt(l)!='B') {
										//System.out.println("좌표 : "+k+", "+l+"현재 블록 : "+ strArr[k].charAt(l));
										count++;
									}
								}
							}
						}
						//System.out.println("Count : "+ count);
						if(min>count) {
							min = count;
							
						}
					}
				}
				//왼쪽 상단이 짝수일 때
				else {
					
					//짝수이고, 검정색일 때
					if(leftUp=='B') {
						//System.out.println("x : "+i+" y : "+ j);
						//System.out.println("왼쪽 상단은 짝수, 검정색이다.");
						for(int k=i;k<i+8;k++) {
							for(int l=j;l<j+8;l++) {
								
								//짝수 블록
								if((k+l)%2==0) {
									//짝수 블록이 흰색일 때
									if(strArr[k].charAt(l)!='B') {
									//	System.out.println("좌표 : "+k+", "+l+"현재 블록 : "+ strArr[k].charAt(l));
										count++;
									}
									
								}
								//홀수 블록
								else {
									//홀수 블록이 검정일 때
									if(strArr[k].charAt(l)!='W') {
									//	System.out.println("좌표 : "+k+", "+l+"현재 블록 : "+ strArr[k].charAt(l));
										count++;
									}
								}
							}
						}
					//	System.out.println("Count : "+ count);
						if(min>count) {
							min = count;
						}
					
					}
					//짝수이고, 흰색일 때
					else {
						//System.out.println("x : "+i+" y : "+ j);
						//System.out.println("왼쪽 상단은 짝수, 흰색이다.");
						for(int k=i;k<i+8;k++) {
							for(int l=j;l<j+8;l++) {
								
								//짝수 블록
								if((k+l)%2==0) {
									//짝수 블록이 검정색일 때
									if(strArr[k].charAt(l)!='W') {
										//System.out.println("좌표 : "+k+", "+l+"현재 블록 : "+ strArr[k].charAt(l));
										count++;
									}
									
								}
								//홀수 블록
								else {
									//홀수 블록이 흰색일 때
									if(strArr[k].charAt(l)!='B') {
										//System.out.println("좌표 : "+k+", "+l+"현재 블록 : "+ strArr[k].charAt(l));
										count++;
									}
								}
							}
						}
						//System.out.println("Count : "+ count);
						if(min>count) {
							min = count;
						}
					}
				}
			}
		}
		System.out.println(min);
		//System.out.println(leftUp);
		
		/*int num = Integer.parseInt(bf.readLine());
		int[][] arr = new int[num][2];
		
		for(int i=0;i<num;i++) {
			StringTokenizer stk = new StringTokenizer(bf.readLine(), " ");
			arr[i][0] = Integer.parseInt(stk.nextToken());
			arr[i][1] = Integer.parseInt(stk.nextToken());
		}
		int[] records = new int[num];
		for(int i=0;i<num;i++) {
			records[i] = 1;
		}
		
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					records[i]++;
				}
				
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int h : records) {
			sb.append(h).append(" ");
		}
		System.out.println(sb);*/

	}

}
