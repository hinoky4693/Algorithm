import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        s += s;
        
        Stack <Character> stack = new Stack<>();
        for(int j=0;j<s.length()/2;j++){
            boolean valid = true;
            for(int i=j;i<s.length()/2+j;i++){
                if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    stack.add(s.charAt(i));
                } else {
                    if (stack.isEmpty()){
                        valid = false;
                        break;
                    }
                    char prev = stack.pop();
                    if (s.charAt(i) - prev > 2) {
                        valid = false;
                        break; 
                    }
                }
                
            }
            if (valid && stack.isEmpty()) answer++;
        }
            
        return answer;
    }
    
}