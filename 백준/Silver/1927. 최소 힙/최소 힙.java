import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<N; i++){
            int curr = Integer.parseInt(br.readLine());
            if (curr == 0 && pq.size() == 0) System.out.println("0");
            else if (curr == 0) System.out.println(pq.poll());
            else {
                pq.add(curr);
            }
        }
    }
}