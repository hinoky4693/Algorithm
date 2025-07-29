import java.util.*;

class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(curr - 'a' >= 0 && curr - 'z' <= 0) {
                if(curr + n >= 123) {
                    curr = (char)(curr - 26 + n);
                } else {
                    curr += n;
                }
            } else if(curr - 'A' >= 0 && curr - 'Z' <= 0){
                if(curr + n >= 91) {
                    curr = (char)(curr - 26 + n);
                } else {
                    curr += n;
                }
            }
            answer.append(curr);
        }
        
        return answer.toString();
    }
}