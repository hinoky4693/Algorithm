class Solution {
    public int solution(int n) {
        int answer = 1;
        
        while ((n-7)>0){
            answer++;
            n=n-7;
        }
        return answer;
    }
}