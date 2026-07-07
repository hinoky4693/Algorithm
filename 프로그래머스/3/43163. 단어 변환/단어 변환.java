import java.util.*;

class Solution {
    
    String begin, target;
    String[] words;
    Set<String> visited;
    
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        this.begin  = begin;
        this.target = target;
        this.words  = words;
        visited = new HashSet<>();
        
        answer = bfs();    
        
        return answer;
    }
    
    public int bfs() {
        
        Queue<String> q = new LinkedList<>();
        
        q.add(begin);
        int cnt = 0;
        
        while(!q.isEmpty()) {
            
            int size = q.size();
            
            for(int j=0; j<size; j++) {
                String curr = q.poll();

                if(curr.equals(target)) {
                    return cnt;
                }
                for(String word : words) {
                    if(visited.contains(word)) continue;

                    int count = 0;
                    for(int i=0; i<word.length(); i++) {
                        if(curr.charAt(i) == word.charAt(i)) count++;
                    }
                    if (count == word.length() - 1) {
                        q.add(word);
                        visited.add(curr);
                    }
                }
            }
            cnt++;
        }
        return 0;
    }
}