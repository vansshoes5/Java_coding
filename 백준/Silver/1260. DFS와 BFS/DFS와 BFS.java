import java.util.*;
import java.io.*;

public class Main {

    static int[][] dfs_graph;
    static boolean[] dfs_check;
    static int[][] bfs_graph;
    static boolean[] bfs_check;

    static StringBuilder sb = new StringBuilder();

    private static void dfs(int node, int n){

        sb.append(node).append(" ");
        dfs_check[node] = true;
        for(int i=1;i<=n;i++){
            if(dfs_graph[node][i] == 1 && !dfs_check[i]){

                dfs_graph[node][i] = 0;
                dfs_graph[i][node] = 0;
                dfs(i, n);


            }
        }


    }

    private static void bfs(int start, int n){

        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(start);
        bfs_check[start] = true;

        while(!queue.isEmpty()){
            int a = queue.poll();
            sb.append(a).append(" ");
            for(int i=1;i<=n;i++){
                if(bfs_graph[a][i]==1 && !bfs_check[i]){
                    bfs_check[i] = true;
                    bfs_graph[a][i] = 0;
                    bfs_graph[i][a] = 0;
                    queue.add(i);
                }
            }
        }

        /*for(int i=1;i<=n;i++){
            if(!bfs_check[i]){
                bfs_check[i] = true;
                System.out.print(i+" ");
            }
        }*/



    }

    public static void main(String[] args) throws IOException{
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

       StringTokenizer stk = new StringTokenizer(bf.readLine());
       int n = Integer.parseInt(stk.nextToken());
       int k = Integer.parseInt(stk.nextToken());
       int v = Integer.parseInt(stk.nextToken());

       dfs_graph = new int[n+1][n+1];
       dfs_check = new boolean[n+1];
       bfs_graph = new int[n+1][n+1];
       bfs_check = new boolean[n+1];



       for(int i=0;i<k;i++){
           stk = new StringTokenizer(bf.readLine());
           int a = Integer.parseInt(stk.nextToken());
           int b = Integer.parseInt(stk.nextToken());
           dfs_graph[a][b] = 1;
           dfs_graph[b][a] = 1;
           bfs_graph[a][b] = 1;
           bfs_graph[b][a] = 1;

       }

       dfs(v, n);
       sb.append("\n");
       bfs(v, n);

       System.out.println(sb);
    }
}