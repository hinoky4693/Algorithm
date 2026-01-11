import java.util.*;
import java.io.*;

class Main {
    static long answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        
        System.out.println(bfs(A, B) == true ? answer : -1);
    }
    
    public static boolean bfs(long A, long B) {
        Queue<Long> q = new LinkedList<>();
        q.add(A);
        
        while(!q.isEmpty()) {
            answer++;
            int size = q.size();
            for(int i=0; i<size; i++){
                long curr = q.poll();
                if(curr == B) return true;
                if(curr * 2 <= B) q.add(curr*2);
                if(curr * 10 + 1 <= B) q.add(curr*10+1);
            }
        }
        
        return false;
    }
}