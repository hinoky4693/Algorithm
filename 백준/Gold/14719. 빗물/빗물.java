import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        
        int[] map = new int[W];
        int answer = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < W; i++) {
            map[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] leftWall = new int[W];
        int[] rightWall = new int[W];
        leftWall[0] = map[0];
        rightWall[W-1] = map[W-1];
        for(int i=1; i<W; i++) {
            leftWall[i] = Math.max(leftWall[i-1], map[i]);
        }
        
        for(int i=W-2; i>=0; i--) {
            rightWall[i] = Math.max(rightWall[i+1], map[i]);
        }

        for(int i=0; i<W; i++) {
            answer += Math.min(leftWall[i], rightWall[i]) - map[i];
        }

        System.out.println(answer);
    }
} 