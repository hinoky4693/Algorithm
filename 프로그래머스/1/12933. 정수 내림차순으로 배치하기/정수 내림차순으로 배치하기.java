import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        PriorityQueue<Long> pq = new PriorityQueue<> ();
        while (n > 0){
            pq.add(-n % 10);
            n /= 10;
        }
        while(!pq.isEmpty()){
            answer *= 10;            
            answer += -pq.poll();
        }
        return answer;
    }
}