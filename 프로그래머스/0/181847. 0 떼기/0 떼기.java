// 1. n_str을 n_str.length만큼 for문 돌린다.
// 2. if (n_str.charAt(i) == 0)이면 continue 하고, else로 answer += i;

class Solution {
    public String solution(String n_str) {
        String answer = "";
        boolean iszero = false;
        for(int i=0;i<n_str.length();i++) {
            if (n_str.charAt(i) != '0') {
                iszero = true;
            }
            
            if (iszero == false){
                continue;
            } else {
                answer += n_str.charAt(i);
            }
        }    
        return answer;
    }
}