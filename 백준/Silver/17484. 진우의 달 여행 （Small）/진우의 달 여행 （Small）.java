import java.util.*;
import java.io.*;

public class Main {
    static int[][] map;
    static int N, M;
    static int answer;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        map = new int[N][M+2];
        answer = Integer.MAX_VALUE;
        
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for(int i=1; i<=M; i++) {
            dfs(0, i, map[0][i], -1);
        }
        
        System.out.println(answer);
        
    }
    
    public static void dfs(int i, int j, int val, int dir) {
        if(j == 0 || j == M+1) return;
        if(i == N-1) {
            answer = Math.min(val, answer);
            return;
        }
        
        if(dir == -1) {
            dfs(i+1, j-1, val + map[i+1][j-1], 0);
            dfs(i+1, j, val + map[i+1][j], 1);
            dfs(i+1, j+1, val + map[i+1][j+1], 2);
        }
        else if(dir == 0) {
            dfs(i+1, j, val + map[i+1][j], 1);
            dfs(i+1, j+1, val + map[i+1][j+1], 2);
        } 
        else if(dir == 1) {
            dfs(i+1, j-1, val + map[i+1][j-1], 0);
            dfs(i+1, j+1, val + map[i+1][j+1], 2);
        }
        else if(dir == 2) {
            dfs(i+1, j-1, val + map[i+1][j-1], 0);
            dfs(i+1, j, val + map[i+1][j], 1);
        }
    }
}