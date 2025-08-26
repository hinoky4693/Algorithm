import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] dr = {1, 0, -1, 0};
        int[] dc = {0, -1, 0, 1};
        
        int[][] map = new int[n][n];
        Set<Integer> set = new TreeSet<>();
        set.add(0);
        for(int r = 0; r < n; r++) {
            String line = br.readLine();
            String[] currLine = line.split(" ");
            for(int c = 0; c < n; c++){
                map[r][c] = Integer.parseInt(currLine[c]);
                set.add(map[r][c]);
            }
        }
        int answer = 0;
        for(int i : set){
            boolean[][] visited = new boolean[n][n];
            for(int r = 0; r < n; r++){
                for(int c = 0; c < n; c++){
                    if(map[r][c] <= i) visited[r][c] = true;
                }
            }
            int temp = 0;
            for(int r = 0; r < n; r++){
                for(int c = 0; c < n; c++){
                    if(!visited[r][c]) {
                        Queue<int[]> q = new LinkedList<>();
                        q.add(new int[] {r, c});
                        visited[r][c] = true;
                        temp++;
                        
                        while(!q.isEmpty()){
                            int[] curr = q.poll();
                            for(int d=0; d<4; d++){
                                int nr = curr[0] + dr[d];
                                int nc = curr[1] + dc[d];
                                if(nr >= n || nr < 0 || nc >= n || nc < 0) continue;
                                if(visited[nr][nc]) continue;
                                
                                q.add(new int[] {nr, nc});
                                visited[nr][nc] = true;
                            }
                        }
                    }
                }
            }
            answer = Math.max(temp, answer);
        }
        System.out.println(answer);
        
    }
}