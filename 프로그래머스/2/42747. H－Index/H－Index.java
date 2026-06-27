class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        int left = 0;
        int right = 10000;
        int count;
        while(left <= right) {
            count = 0;
            int mid = (left + right) / 2;
            
            for(int i=0; i<citations.length; i++) {
                if (citations[i] >= mid) count++;
            }
            
            if(count < mid) right = mid - 1;
            else if(count >= mid) {
                left = mid + 1;
                answer = mid;
            }
        }
        
        return answer;
    }
}