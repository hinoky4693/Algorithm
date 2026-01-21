import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int tc = 1; tc <= T; tc++){
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] stocks = new int[N];
            for(int i=0; i<N; i++){
                stocks[i] = Integer.parseInt(st.nextToken());
            }
            int[] max = {-1, 0};
            long answer = 0;
            while(true){
                max[1] = 0;
                int prevMax = max[0]+1;
                for(int i=prevMax; i<N; i++){
                    if(stocks[i] >= max[1]) {
                        max[0] = i;
                        max[1] = stocks[i];
                    }
                }
                
                for(int i=prevMax; i<max[0]; i++){
                    answer += max[1] - stocks[i];    
                }
                if (max[0] == N-1) break;
            }
            
            System.out.println(answer);
            
            
        }
    }
}