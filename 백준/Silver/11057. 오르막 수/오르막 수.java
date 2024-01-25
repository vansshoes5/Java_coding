import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

       int n = Integer.parseInt(bf.readLine());

       long dp[][] = new long[n+1][10];

       long total = 0;
       for(int i=0;i<10;i++){
           dp[0][i] = 1;

       }

       for(int i=1;i<=n;i++){


           for(int j=0;j<10;j++){

               for(int k=j;k<10;k++){
                   dp[i][j] += dp[i-1][k];
                   dp[i][j] %= 10007;
                   //System.out.println("dp["+i+"]["+j+"]: "+dp[i][j]);

               }
           }

       }

       System.out.println(dp[n][0]%10007);


    }
}