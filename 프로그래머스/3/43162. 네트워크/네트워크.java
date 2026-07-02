import java.util.*;

class Solution {
    
    boolean[] visited;
    int[][] computers;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        this.computers = computers;
        
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                bfs(i);
                answer++;
            }
        }
        
        return answer;
    }
    public void bfs(int aa) {
        visited[aa] = true;
        
        for(int i=0; i<computers.length; i++) {
            if(i != aa && computers[aa][i] == 1) {
                if(visited[i]) continue;
                bfs(i);
            }
        }
    }
}