import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
                
        for (int i = 0; i < s.length(); i++) {
            int curr = (int) s.charAt(i);
            int cnt = 0;
            while (true) {
                
                if (cnt == index) break;
                
                if ((++curr) >= 123) curr -= 26;
                
                if (!skip.contains(String.valueOf((char)curr))) {
                    cnt++;
                }
            }
            sb.append((char) curr);
        }
        
        return sb.toString();
    }
}