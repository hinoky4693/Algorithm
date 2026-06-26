import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        answer = participant[participant.length-1];
        
        for(int i=0; i<completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                answer = participant[i];
                break;
            }
        }
        
        return answer;
    }
}