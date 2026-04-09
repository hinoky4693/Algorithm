import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        String table = br.readLine();
        
        boolean[] visitedH = new boolean[N];
        boolean[] visitedP = new boolean[N];
        int answer = 0;
        for(int i=0; i<N; i++){
            if (table.charAt(i) == 'H') visitedH[i] = true;
            if (table.charAt(i) == 'P') visitedP[i] = true;
        }
        
        for(int i = 0; i < N; i++) {
            if(visitedP[i]) {
                for(int j = K; j >= -K; j--) {
                    if(i - j < 0 || i - j >= N) continue;
                    else {
                        if(visitedH[i - j]) {
                            visitedH[i - j] = false;
                            visitedP[i - j] = false;
                            answer++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }
}