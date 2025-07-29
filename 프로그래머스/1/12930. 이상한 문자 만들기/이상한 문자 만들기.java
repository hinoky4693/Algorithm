import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if (curr == ' '){
                idx = -1;
            }
            
            if (idx % 2 == 0) {
                if ( curr - 'a' >= 0 && curr - 'z' <= 0) curr = (char)(curr - 32);
            } else {
                if ( curr - 'A' >= 0 && curr - 'Z' <= 0) curr = (char)(curr + 32);
                
            }
            sb.append(String.valueOf(curr));
            idx++;
        }
        
        answer = sb.toString();
        
        return answer;
    }
}