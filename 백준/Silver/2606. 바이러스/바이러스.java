import java.util.*;
import java.io.*;

public class Main {



    public static void main(String[] args) throws IOException{
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

       // computers
       int n = Integer.parseInt(bf.readLine());
       // connection
       int t = Integer.parseInt(bf.readLine());

       int[][] computers = new int[n+1][n+1];
       boolean[] check = new boolean[n+1];

       StringTokenizer stk;

       for(int i=1;i<=t;i++){
           stk = new StringTokenizer(bf.readLine());
           int a = Integer.parseInt(stk.nextToken());
           int b = Integer.parseInt(stk.nextToken());

           computers[a][b] = 1;
           computers[b][a] = 1;
       }

       Queue<Integer> queue = new LinkedList<>();

       check[1] = true;
       queue.add(1);

       while(!queue.isEmpty()){
           int a = queue.poll();
           //System.out.println("a: "+a);
           for(int i=1;i<=n;i++){
               if(computers[a][i] ==1 && !check[i]){
                   computers[a][i] = 0;
                   computers[i][a] = 0;
                   check[i] = true;
                   queue.add(i);
               }
           }
       }

       int count=0;
       for(int i=2;i<=n;i++){
           if(check[i]){
               //System.out.println("i: "+i);
               count++;
           }

       }
       System.out.println(count);
    }
}