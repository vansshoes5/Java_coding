import java.io.*;
import java.util.*;
import java.math.BigInteger;

/*
 *  SWEA
 *  
 *  
 *  
 *  
 *  
 * */

public class Main {
	
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub  
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		
		//System.out.print("input tc: ");
		
		
		
		
		StringTokenizer stk = new StringTokenizer(bf.readLine());
		
		BigInteger money = new BigInteger(stk.nextToken());
		BigInteger cre = new BigInteger(stk.nextToken());
		BigInteger count = new BigInteger("0");
		
		
		count = money.remainder(cre);
		money = money.divide(cre);
				
		
		System.out.println(money);
		System.out.println(count);
		
		
		
		
	}

}
