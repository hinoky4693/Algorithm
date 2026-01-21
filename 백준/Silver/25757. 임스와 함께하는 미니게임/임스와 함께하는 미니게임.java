import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        String game = st.nextToken();
        
        Set<String> set = new TreeSet<>();
        for(int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        
        System.out.println(game.equals("Y") ? set.size() : game.equals("F") ? set.size()/2 : set.size()/3);
    }
}