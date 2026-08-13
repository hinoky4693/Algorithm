import java.util.*;

class Solution {

    boolean[][] visited;
    int[] dr = {1, 0, -1, 0};
    int[] dc = {0, -1, 0, 1};
    int gridR, gridC, answer;
    char[][] grid;


    public int numIslands(char[][] grid) {

        this.grid = grid;
        gridR = grid.length;
        gridC = grid[0].length;

        visited = new boolean[gridR][gridC];

        for(int r=0; r<gridR; r++) {
            for(int c=0; c<gridC; c++) {
                if(grid[r][c] == '1') {
                    if(!visited[r][c]) bfs(r, c);
                }
            }
        }


        return answer;
    }

    void bfs(int r, int c) {
        answer++;
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[] {r, c});
        visited[r][c] = true;

        while(!q.isEmpty()) {
            int size = q.size();

            for(int i=0; i<size; i++) {
                int[] curr = q.poll();

                for(int d = 0; d < 4; d++) {
                    int nr = curr[0] + dr[d];
                    int nc = curr[1] + dc[d];

                    if(nr >= gridR || nr < 0 || nc >= gridC || nc < 0) continue;
                    if(visited[nr][nc]) continue;
                    if(grid[nr][nc] == '0') continue;

                    q.add(new int[] {nr, nc});
                    visited[nr][nc] = true;
                }
            }
        }

    }
}