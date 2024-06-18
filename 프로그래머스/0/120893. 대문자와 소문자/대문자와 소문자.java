class Solution {
    public String solution(String my_string) {
        String answer = "";
        int n = my_string.length();
        for(int i=0;i<n;i++){
            if (my_string.charAt(i)>='a' && my_string.charAt(i)<='z'){
                answer = answer + (char)(my_string.charAt(i)-32);
            } else if (my_string.charAt(i)>='A' && my_string.charAt(i)<='Z'){
                answer = answer + (char)(my_string.charAt(i)+32);
            }
        }
        return answer;
    }
}