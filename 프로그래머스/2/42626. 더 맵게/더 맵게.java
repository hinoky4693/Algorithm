import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<> ();
        
        for(int i : scoville) {
            pq.add(i);
        }
        
        
        while(true) {
            if(pq.size() == 1) {
                if(pq.peek() < K) return -1;
            }
            
            if(pq.peek() < K) {
                int min1 = pq.poll();
                int min2 = pq.poll();
                
                pq.add(min1 + min2 * 2);
                answer++;
            }
            else {
                return answer;
            }   
        }
        
    }
}