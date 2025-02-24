import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        int small = 0;
        int big = 0;
        small = Math.min(num1,num2);
        big = Math.max(num1,num2);
        for(int i=0;i<my_string.length();i++){
            if(i == small){
                sb.append(my_string.charAt(big));
            } else if(i == big){
                sb.append(my_string.charAt(small));
            } else {
                sb.append(my_string.charAt(i));
            }            
        }
        return sb.toString();
    }
}