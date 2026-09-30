import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int work : works) {
            pq.add(-work);
        }
        
        while(n > 0) {
            int largest = -pq.poll();
            int nextLarge = -pq.peek();

            while(n > 0 && largest >= nextLarge) {
                if(nextLarge == 0) return 0;
                n--;
                largest--;
            }
            
            pq.add(-largest);
        }
        int size = pq.size();
        for(int i=0; i<size; i++) {
            int curr = pq.poll();
            answer += curr * curr;
        }

        
        return answer;
    }
}