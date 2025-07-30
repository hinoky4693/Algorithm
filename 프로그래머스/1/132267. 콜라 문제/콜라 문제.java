class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int curr = n;
        int rest = 0;
        
        while(curr >= a){
            answer += (curr / a) * b;
            
            rest = curr % a;
            rest += (curr / a) * b;
            
            curr = rest;
            rest = 0;
        }
        
        return answer;
    }
}