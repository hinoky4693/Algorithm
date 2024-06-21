class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0;i<my_string.length();i++){
           if (my_string.charAt(i) == 'a'){
               answer += "";
           } else if(my_string.charAt(i) == 'e') {
               answer += "";
           } else if(my_string.charAt(i) == 'i') {
               answer += "";
           } else if(my_string.charAt(i) == 'o') {
               answer += "";
           } else if(my_string.charAt(i) == 'u' ){
               answer += "";
           } else {
               answer += my_string.charAt(i);
           }
        }
        
        return answer;
    }
}