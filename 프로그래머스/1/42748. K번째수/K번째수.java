import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int tc = 0; tc < commands.length; tc++) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i= commands[tc][0]-1; i<commands[tc][1]; i++) {
                pq.add(array[i]);
            }
            
            int val = 0;
            for(int i=0; i<commands[tc][2]; i++) {
                val = pq.poll();
            }
            
            answer[tc] = val;
        }
        
        
        return answer;
    }
}