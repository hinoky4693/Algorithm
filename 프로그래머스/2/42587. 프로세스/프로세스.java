import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<int[]> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        
        for(int i=0; i<priorities.length; i++) {
            q.offer(new int[] {priorities[i], i});
            pq.offer(priorities[i]);
        }
        
        int order = 0;
        while(!q.isEmpty()) {
            int[] curr = q.poll();
            
            if (curr[0] == pq.peek()) {
                order++;
                pq.poll();
                if(curr[1] == location) return order;
                
            } else {
                q.add(curr);
            }
        }
        
        return -1;

    }
}