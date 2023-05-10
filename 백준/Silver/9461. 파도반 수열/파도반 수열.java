import java.util.Scanner;


public class Main {
	
	public static Long[] pado = new Long[101];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int i;
		
		pado[0] = 0L;
		pado[1] = 1L;
		pado[2] = 1L;
		pado[3] = 1L;
		
		int test = in.nextInt();
		
		for(i=0;i<test;i++) {
			int input = in.nextInt();
			
			System.out.println(padovan(input));
		}
		
		
	}
	
	public static long padovan(int num) {
		if(pado[num] == null) {
			pado[num] = padovan(num-2) + padovan(num-3);
		}
		return pado[num];
	}
	
	

}
