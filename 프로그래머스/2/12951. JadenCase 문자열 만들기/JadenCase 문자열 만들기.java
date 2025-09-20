import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        boolean firstChar = true;
        
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == ' '){
                sb.append(" ");
                firstChar = true;
                continue;
            }
            if(firstChar) {
                sb.append(Character.toUpperCase(s.charAt(i)));
                firstChar = false;
            } else {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        
        return sb.toString();
    }
}