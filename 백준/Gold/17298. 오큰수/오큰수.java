import java.util.*;
import java.io.*;

public class Main {




    public static void main(String[] args) throws IOException{
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

       // computers
       int n = Integer.parseInt(bf.readLine());

       int[] arr = new int[n];
       Stack<Integer> stack = new Stack<>();
       StringBuilder sb = new StringBuilder();

       StringTokenizer stk = new StringTokenizer(bf.readLine());

       for(int i=0;i<n;i++){
           arr[i] = Integer.parseInt(stk.nextToken());
       }

       for(int i=0;i<n;i++){

           while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
               arr[stack.pop()] = arr[i];
           }
           stack.push(i);

       }
       while(!stack.isEmpty()){
           arr[stack.pop()] = -1;
       }

       for(int a:arr){
           sb.append(a).append(" ");
       }

       System.out.println(sb);

    }
}