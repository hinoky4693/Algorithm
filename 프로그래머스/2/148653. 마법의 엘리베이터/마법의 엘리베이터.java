class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while(storey > 0) {
            int curr = storey % 10;             // 오른쪽 끝자리
            int next = (storey / 10) % 10;      // 다음 자리
            
            if(curr < 5) answer += curr;
            else if (curr > 5) {
                answer += 10 - curr;
                storey += 10;
            }
            
            if(curr == 5) {
                if(next < 5) {
                    answer += curr;
                } else {
                    answer += curr;
                    storey += 10;
                }
            }
            
            storey /= 10;
        }
        
        
        
        return answer;
    }
}