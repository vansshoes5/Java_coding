import java.util.*;
import java.io.*;

public class Main {





    public static void main(String[] args) throws IOException{
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

       StringTokenizer stk = new StringTokenizer(bf.readLine());
       int e = Integer.parseInt(stk.nextToken());
       int s = Integer.parseInt(stk.nextToken());
       int m = Integer.parseInt(stk.nextToken());

       int result = 0;
       boolean flag = true;

       int a=e, b=s, c=m;

       while(true){
           e -=1;
           s-=1;
           m-=1;

           result++;
           if(e==0){
               if(s==0 && m==0){
                   break;
               }
               e = 15;
           }
           if(s==0){
               s = 28;
           }
           if(m==0){
               m = 19;
           }

       }

       System.out.println(result);


    }
}