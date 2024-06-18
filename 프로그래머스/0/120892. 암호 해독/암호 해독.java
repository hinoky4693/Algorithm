class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int n = cipher.length() / code + 1;
        for(int i=1;i<n;i++){
            answer = answer + cipher.charAt(code*(i)-1);
        }
        return answer;
    }
}