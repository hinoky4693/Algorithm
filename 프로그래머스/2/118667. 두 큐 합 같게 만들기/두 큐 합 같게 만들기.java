import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        long sum1 = 0;
        for(int i : queue1){
            q1.add(i);
            sum1 += i;
        }
        
        long sum2 = 0;
        for(int i : queue2){
            q2.add(i);
            sum2 += i;
        }
        while(true) {
            
            if (answer > (queue1.length + queue2.length) + 2) {
                answer = -1;
                break;
            }
            
            if (sum1 > sum2) {
                int curr = q1.poll();
                sum1 -= curr;
                q2.add(curr);
                sum2 += curr;
                answer++;
            }
            else if (sum1 < sum2) {
                int curr = q2.poll();
                sum2 -= curr;
                q1.add(curr);
                sum1 += curr;
                answer++;
            } else break;
        }
        
        return answer;
    }
}