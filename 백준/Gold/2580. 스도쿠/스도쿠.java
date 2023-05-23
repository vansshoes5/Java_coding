import java.io.*;
import java.util.*;

public class Main {
	
	static int line = 9;
	 
	
	//겹치는 친구 검사하기
	private static boolean middle(int[][] board,int x, int y, int val) {
		
		//가로 검사
		for(int i=0;i<9;i++) {
			if(board[x][i] == val) {
				return false;
			}
		}
		
		
		//세로 검사
		for(int i=0;i<9;i++) {
			if(board[i][y]==val) {
				return false;
			}
		}
		
		//정사각형 검사
		int g = (x/3)*3;
		int s = (y/3)*3;
		for(int i=g;i<g+3;i++) {
			for(int j=s;j<s+3;j++) {
				if(board[i][j]==val) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	//퀸이 들어갈 자리가 있는지 없는지 검사하기
	
	//making sudoku
	private static void sudoku(int[][] board, int row, int col) {
		
		//boolean flag= true;
		if(col==9) {
			sudoku(board, row+1, 0);
			return;
		}
		if(row==9) {
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<9;i++) {
				for(int j=0;j<line;j++) {
					sb.append(board[i][j]).append(" ");
				}
				//sb.trimToSize();
				sb.append("\n");
			}
			//sb.setLength(sb.length()+1);
			System.out.println(sb);
			System.exit(0);
		}
		
		if(board[row][col]==0) {
			for(int i=1;i<=9;i++) {
				if(middle(board, row, col, i)) {
					board[row][col] = i;
					sudoku(board, row, col+1);
				}
			}
			board[row][col] = 0;
			return;
		}
	
		sudoku(board, row, col+1);
	}
	
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		
		int[][] board = new int[line][line];
		
		for(int i=0;i<line;i++) {
			stk = new StringTokenizer(bf.readLine(), " ");
			for(int j=0;j<line;j++) {
				board[i][j] = Integer.parseInt(stk.nextToken());
				
			}
			
			//sb.append("\n");
			
		}
		
		sudoku(board, 0, 0);
		//ArrayList<Integer>[] arr = new ArrayList[9];
		
		
		
		
		//int count = 0;
		//may(chess, N, 0);
		//System.out.println(count);
	}

}
