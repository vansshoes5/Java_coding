import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

       int n = Integer.parseInt(bf.readLine());
       StringTokenizer stk = new StringTokenizer(bf.readLine());

       int[] pack = new int[n+1];
       int[] dp = new int[n+1];

       for(int i=1;i<=n;i++){
           pack[i] = Integer.parseInt(stk.nextToken());
       }

       dp[1] = pack[1];

       for(int i=2;i<=n;i++){
           dp[i] = pack[i];
           for(int j=1;j<=i;j++){
               dp[i] = Math.max(dp[i], dp[j]+pack[i-j]);
           }
           //System.out.println(dp[i]);
       }

        System.out.println(dp[n]);

    }
}