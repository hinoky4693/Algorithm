import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        
        Queue<int[]> q = new LinkedList<>();
        
        for(int priority : priorities) {
            pq.add(priority);
        }
        
        for(int i=0; i<priorities.length; i++) {
            if(i == location) q.add(new int[] {priorities[i], 1});
            else q.add(new int[] {priorities[i], 0});
        }
        
        
        while(!q.isEmpty()) {
            int max = pq.poll();
            int[] curr = q.poll();
            
            if(curr[0] < max) {
                pq.add(max);
                q.add(curr);
            }
            else {
                answer++;
                if(curr[1] == 1) break;
            }
        }

        return answer;
    }
}