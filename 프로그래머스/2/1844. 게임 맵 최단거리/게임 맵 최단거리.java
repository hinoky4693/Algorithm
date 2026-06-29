import java.util.*;

class Solution {
    
    int[] dr = {1, 0, -1, 0};
    int[] dc = {0, -1, 0, 1};
    
    int mapN, mapM;
    
    int[][] maps;
    boolean[][] visited;
    
    public int solution(int[][] maps) {
        
        this.maps = maps;
        
        mapN = maps.length;
        mapM = maps[0].length;
        
        visited = new boolean[mapN][mapM];
        
        return bfs();
    }
    
    public int bfs() {
        
        Queue<int[]> q = new LinkedList<>();
        
        q.add(new int[] {0, 0, 1});
        visited[0][0] = true;
        
        while(!q.isEmpty()) {
            int[] curr = q.poll();
            
            if(curr[0] == mapN - 1 && curr[1] == mapM - 1) return curr[2];
            
            for(int d = 0; d < 4; d++) {
                int nr = curr[0] + dr[d];
                int nc = curr[1] + dc[d];
                
                if(nr >= mapN || nc >= mapM || nr < 0 || nc < 0) continue;
                if(visited[nr][nc]) continue;
                if(maps[nr][nc] == 0) continue;
                
                q.add(new int[] {nr, nc, curr[2] + 1});
                visited[nr][nc] = true;
            }
        }
        
        
        return -1;
    }
    
    
}