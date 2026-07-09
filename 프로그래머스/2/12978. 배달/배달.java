import java.util.*;

class Solution {
    
    int[] visited;
    List<Map<Integer, Integer>> mapList;
    int N, K;
    
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        this.N = N;
        this.K = K;
        
        visited = new int[N+1];
        
        Arrays.fill(visited, Integer.MAX_VALUE);
        
        mapList = new ArrayList<>();
        
        for(int i = 0; i <= N; i++) {
            mapList.add(new HashMap<>());
        }
        
        for(int[] val : road) {
            mapList.get(val[0]).put(val[1], Math.min(val[2], mapList.get(val[0]).getOrDefault(val[1], 10001)));
            mapList.get(val[1]).put(val[0], Math.min(val[2], mapList.get(val[1]).getOrDefault(val[0], 10001)));
        }
        
        
        bfs(1);

        for(int i : visited) {
            if(i <= K) answer++;
        }
        
        return answer;
    }
    
    public void bfs(int node) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = 0;
        Map<Integer, Integer> currMap;
        while(!q.isEmpty()) {
            int curr = q.poll();
            currMap = mapList.get(curr);
            
            for(int i : currMap.keySet()) {
                if(visited[i] > visited[curr] + currMap.get(i)) q.add(i);
                visited[i] = Math.min(visited[i], visited[curr] + currMap.get(i));
            }
        }
    }
}