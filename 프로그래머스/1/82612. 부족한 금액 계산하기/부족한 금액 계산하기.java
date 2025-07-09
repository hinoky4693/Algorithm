class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        int n = 1;
        for(int i=0;i<count;i++){
            sum += price * n++;
        }
        
        answer = money - sum;

        
        return answer >= 0 ? 0 : -answer;
    }
}