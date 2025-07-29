import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < food.length; i++){
            if (food[i] < 1) continue;
            for(int j=0;j<food[i]/2;j++){
                answer.append(i);
            }
        }
        
        StringBuilder sb = new StringBuilder(answer);
        sb.reverse();
        answer.append(0).append(sb);
        return answer.toString();
    }
}