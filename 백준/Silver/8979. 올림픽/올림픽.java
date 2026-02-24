import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] medals = new int[N + 1][4];
        
        for(int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            medals[i][0] = Integer.parseInt(st.nextToken());
            for(int j = 1; j <= 3; j++) {
                medals[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        Arrays.sort(medals, (o1, o2) -> {
            if(o2[1] == o1[1]) {
                if(o2[2] == o1[2]) {
                    if(o2[3] == o1[3]) {
                        return Math.abs(K - o1[0]) - Math.abs(K - o2[0]);
                    }
                    return o2[3] - o1[3];
                }
                return o2[2] - o1[2];
            }
            return o2[1] - o1[1];
        });
        
        for(int i=0; i<N; i++){
            if(medals[i][0] == K) {
                System.out.println(i+1);
                break;
            }
        }
    }
}