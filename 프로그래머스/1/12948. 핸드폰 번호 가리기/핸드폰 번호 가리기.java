import java.util.*;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int size = phone_number.length() - 4;
        for(int i=0;i<size;i++) sb.append("*");
        for(int i=size;i<phone_number.length();i++){
            sb.append(String.valueOf(phone_number.charAt(i)));
        }
        answer = sb.toString();
        return answer;
    }
}