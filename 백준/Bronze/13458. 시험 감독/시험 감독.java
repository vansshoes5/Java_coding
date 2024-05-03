import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException{
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

       //시험장 수
       long n = Long.parseLong(bf.readLine());

       long[] room = new long[(int) n];

       StringTokenizer stk = new StringTokenizer(bf.readLine());

       //응시생 수
       for(int i=0;i<n;i++){
           room[i] = Long.parseLong(stk.nextToken());
       }

       long result = n;

       // b : 총감독관 감시 수
       // c : 부감독관 감시 수
       stk = new StringTokenizer(bf.readLine());
       int b = Integer.parseInt(stk.nextToken());
       int c = Integer.parseInt(stk.nextToken());

       for(int i=0;i<n;i++){
           room[i] = room[i]-b;
           long j = 0;
           if(room[i]>0){

               j = room[i]%c==0 ? room[i]/c : (room[i]/c)+1;
           }
           //System.out.println((i+1)+"번 시험장: "+j);
           result += j;

       }

       System.out.println(result);





    }
}