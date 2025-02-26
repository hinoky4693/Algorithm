import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        String temp = "";
        for(int i=0;i<answer.length;i++){
            for(int j=0; j<=i;j++){
                temp += my_string.charAt(answer.length-1-i+j);
            }
            answer[i] = temp;
            temp = "";
        }

        Arrays.sort(answer);
        
        return answer;
    }
}