import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        
        long sum1 = 0;
        long sum2 = 0;
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        for(int num : queue1) {
            q1.add(num);
            sum1 += num;
        }
        
        for(int num : queue2) {
            q2.add(num);
            sum2 += num;
        }
        
        int count = 0;
        while(true) {
            if (count > 1000000) {
                answer = -1;
                break;
            }
            if(sum1 == sum2) break;
            if(sum1 * sum2 == 0) {
                answer = -1;
                break;
            }
            
            
            if(sum1 < sum2) {
                int curr = q2.poll();
                q1.add(curr);
                sum1 += curr;
                sum2 -= curr;
                answer++;
            }
            else {
                int curr = q1.poll();
                q2.add(curr);
                sum1 -= curr;
                sum2 += curr;
                answer++;
            }
            count++;
        }
        
        
        return answer;
    }
}