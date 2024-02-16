import java.util.*;
import java.io.*;

public class Main {

    /*
    * 적록색약이 아닌 사람 : R/G/B 각각 검사
    * 적록색약인 사람 : B or Not B
    * */

    static int n;
    static  char[][] rgb;
    static boolean[][] check;
    static boolean[][] negative;
    static int count=0;

    private static void dfs(int x, int y, char c){

        if(check[x][y]){
            return;
        }
        check[x][y] = true;
        count++;

        if(x>0 && rgb[x-1][y] == c) dfs(x-1, y, c);
        if(x<n-1 && rgb[x+1][y] == c) dfs(x+1, y, c);
        if(y>0 && rgb[x][y-1] == c) dfs(x, y-1, c);
        if(y<n-1 && rgb[x][y+1] == c) dfs(x, y+1, c);

    }

    private static void dfs_2(int x, int y, char c){

        if(negative[x][y]){
            return;
        }
        negative[x][y] = true;
        count++;

        //System.out.println("c: "+c);
        if(c=='B'){
            if(x>0 && rgb[x-1][y] == c) dfs_2(x-1, y, c);
            if(x<n-1 && rgb[x+1][y] == c) dfs_2(x+1, y, c);
            if(y>0 && rgb[x][y-1] == c) dfs_2(x, y-1, c);
            if(y<n-1 && rgb[x][y+1] == c) dfs_2(x, y+1, c);
        }else{
            if(x>0 && rgb[x-1][y] != 'B') dfs_2(x-1, y, c);
            if(x<n-1 && rgb[x+1][y] != 'B') dfs_2(x+1, y, c);
            if(y>0 && rgb[x][y-1] != 'B') dfs_2(x, y-1, c);
            if(y<n-1 && rgb[x][y+1] != 'B') dfs_2(x, y+1, c);
        }



    }


    public static void main(String[] args) throws IOException{
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

       // computers
       n = Integer.parseInt(bf.readLine());

       rgb = new char[n][n];
       check = new boolean[n][n];
       negative = new boolean[n][n];



       for(int i=0;i<n;i++){
           rgb[i] = bf.readLine().toCharArray();
       }

      int result=0;
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               dfs(i, j, rgb[i][j]);
               if(count>0){
                   result++;
                   count=0;
               }
           }
       }
       count=0;
       int temp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dfs_2(i, j, rgb[i][j]);
                if(count>0){
                    temp++;
                    count=0;
                }
            }
        }
       System.out.println(result);
       System.out.println(temp);

      /* for(int i=1;i<=n;i++){
           for(int j=1;j<=n;j++){
               System.out.print(map[i][j]);
           }
           System.out.println();
       }*/

    }
}