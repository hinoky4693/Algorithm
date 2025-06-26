class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int large, small;
        if (a >= b) {
            large = a;
            small = b;
        } else {
            large = b;
            small = a;
        }
        
        for(int i=small;i<=large; i++){
            answer += i;
        }   
        return answer;
    }
}