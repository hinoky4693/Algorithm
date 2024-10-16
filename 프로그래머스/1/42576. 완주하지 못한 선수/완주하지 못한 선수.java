// 1. participant랑 completion 둘다 sort함.
// 2. participant for문 돌려서 !.equals이면 그 값 return.

import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = "";
        for(int i=0;i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                break;
            }
        }
        if (answer.equals("")) answer = participant[participant.length-1];
        return answer;
    }
}