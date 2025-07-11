import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum = 0;
        while(answer < d.length) {
            sum += d[answer];
            if (sum > budget) break;
            answer++;
        }
        
        return answer;
    }
}