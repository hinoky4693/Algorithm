class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        
        int[] time = new int[1450];
        
        for(String[] book : book_time) {
            int start = toMinute(book[0]);
            int end   = toMinute(book[1]);
            
            for(int i = start; i <= end + 9; i++) {
                time[i]++;
            }
        }
                
        for(int i=0; i< 1450; i++) {
            answer = Math.max(answer, time[i]);
        }

        return answer;
    }
    
    public int toMinute(String time) {
        
        return (time.charAt(0) - '0') * 600
             + (time.charAt(1) - '0') * 60
             + (time.charAt(3) - '0') * 10
             + (time.charAt(4) - '0');
    }
}