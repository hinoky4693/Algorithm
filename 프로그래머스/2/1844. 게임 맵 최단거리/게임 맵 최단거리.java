import java.util.*;

class Solution {
    
    int[] dr = {1, 0, -1, 0};
    int[] dc = {0, 1, 0, -1};
    int n;
    int m;
    int[][] visited;
    int[][] maps;
    int answer;
    
    
    public int solution(int[][] maps) {
        
        n = maps.length;
        m = maps[0].length;
        visited = new int[n][m];
        
        for(int i = 0; i < n; i++) {
            Arrays.fill(visited[i], -1);
        }
        
        this.maps = maps;        
        bfs(0, 0);
        
        
        return visited[n-1][m-1];
    }
    
    public void bfs(int r, int c) {
        Queue<int[]> q = new LinkedList<>();
        
        q.add(new int[] {r, c});
        visited[r][c] = 1;
        
        
        while(!q.isEmpty()) {
            int size = q.size();
            
            for(int i=0; i<size; i++) {
                int[] curr = q.poll();
                for(int d = 0; d < 4; d++) {
                    int nr = curr[0] + dr[d];
                    int nc = curr[1] + dc[d];
                    
                    if(nr >= n || nc >=  m || nr < 0 || nc < 0) continue;
                    if(visited[nr][nc] != -1) continue;
                    if(maps[nr][nc] == 0) continue;
                    
                    q.add(new int[] {nr, nc});
                    visited[nr][nc] = visited[curr[0]][curr[1]] + 1;
                }
            }
        }
        
    }
}