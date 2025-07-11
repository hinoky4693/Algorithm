import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        while(n > 0){
            sb.append(String.valueOf(n%3));
            n /= 3;
        }
        long newNum = Long.parseLong(sb.toString());
        String last = String.valueOf(newNum);
        int mul = 1;
        for(int i=last.length()-1;i>=0;i--){
            answer += (last.charAt(i)-'0')*mul;
            mul *= 3;
        }
        return answer;
    }
}