import java.util.*;
import java.io.*;

public class Main {




    public static void main(String[] args) throws IOException{
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

       // computers
        int n = Integer.parseInt(bf.readLine());


        ArrayList<Integer> rope = new ArrayList<>();

        for(int i=0;i<n;i++){
            rope.add(Integer.parseInt(bf.readLine()));
        }
        Collections.sort(rope);

        int max=0;
        for(int i=0;i<n;i++){

            max = Math.max(rope.get(i)*(n-i), max);

        }

        System.out.println(max);


    }
}