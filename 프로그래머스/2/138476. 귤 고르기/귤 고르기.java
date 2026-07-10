import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        
        for(int i : map.values()) {
            pq.add(i);
        }
        
        int sum = 0;
        
        while(true) {
            if(sum < k) {
                sum += pq.poll();
                answer++;
            }
            else break;
        }
        
        return answer;
    }
}