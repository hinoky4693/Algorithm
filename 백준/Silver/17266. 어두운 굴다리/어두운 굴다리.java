import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        
        int[] lamps = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            lamps[i] = Integer.parseInt(st.nextToken());
        }
        
        int length = 0;
        int answer = 0;
        for(int i = 0; i < M - 1; i++) {
            length = lamps[i + 1] - lamps[i];
            answer = Math.max(answer, (length + 1) / 2);
        }
        
        answer = Math.max(answer, lamps[0]);
        answer = Math.max(answer, N - lamps[M-1]);
        
        System.out.println(answer);
    }
}