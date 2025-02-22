class Solution {
    public String solution(String my_string, String alp) {
        String answer = my_string.replace(alp,String.valueOf((char)(alp.charAt(0)-32)));
        return answer;
    }
        
    
}