import java.util.*;

class Solution {
    int[] dr = {1, 0, -1, 0};
    int[] dc = {0, -1, 0, 1};
    int[][] map;
    int mapN;
    int mapM;
    
    boolean[][] visited;
    int answer;
    
    public int solution(int[][] maps) {
        map = maps;
        mapN = maps.length;
        mapM = maps[0].length;
        visited = new boolean[mapN][mapM];
        
        
        int answer = 0;
        answer = bfs(0, 0, 0);
        return answer;
    }
    
    public int bfs(int r, int c, int dist) {
        int answer = Integer.MAX_VALUE;
        visited[r][c] = true;
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {r, c, 1});
        while(!q.isEmpty()) {
            int[] curr = q.poll();

            if(curr[0] == mapN - 1 && curr[1] == mapM - 1) {
                answer = Math.min(answer, curr[2]);
            }
            
            
            for(int d = 0; d < 4; d++) {
                int nr = curr[0] + dr[d];
                int nc = curr[1] + dc[d];

                if(nr >= mapN || nc >= mapM || nr < 0 || nc < 0) continue;
                if(map[nr][nc] == 0) continue;
                if(visited[nr][nc]) continue;


                q.add(new int[] {nr, nc, curr[2]+1});
                visited[nr][nc] = true;
            }
        }
        
        if (answer == Integer.MAX_VALUE) answer = -1;
        return answer;
    }
}