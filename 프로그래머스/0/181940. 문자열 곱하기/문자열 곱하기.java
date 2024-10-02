// 1. k만큼 answer에 my_string for문으로 더해줌.

class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        
        for(int i=0;i<k;i++){
            answer += my_string;
        }
        
        
        return answer;
    }
}