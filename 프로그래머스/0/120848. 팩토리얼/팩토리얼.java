class Solution {
    public int solution(int n) {
        int fact = 1;
        int answer = 2;
        while(fact <= n){
            fact *= (answer++);
        }
        
        
        return answer-2;
    }
}