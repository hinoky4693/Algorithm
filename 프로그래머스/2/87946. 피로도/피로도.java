import java.util.*;

class Solution {
    
    boolean[] visited;
    int answer;
    int[][] dungeons;
    
    public int solution(int k, int[][] dungeons) {
        
        visited = new boolean[dungeons.length];
        this.answer = answer;
        this.dungeons = dungeons;
        
        dfs(k, 0);
        
        return answer;
    }
    
    void dfs(int k, int count) {
        answer = Math.max(answer, count);
        if(count == dungeons.length) return;
        
        for(int i=0; i<dungeons.length; i++) {
            if(!visited[i]) {
                if(k >= dungeons[i][0]) {
                    visited[i] = true;
                    dfs(k - dungeons[i][1], count + 1);
                    visited[i] = false;
                }
            }
            
        }
        
        
    }
}