class Solution {
    public String solution(int num) {
        String answer = "";
        if(num < 0) num = -num;
        if(num%2 == 1) answer = "Odd";
        else answer = "Even";
        return answer;
    }
}