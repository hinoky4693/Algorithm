import java.util.*;

class Solution {
    
    int[] timeTable = new int[1440];
    
    public int solution(String[][] book_time) {
        int answer = 0;
        
        schedule(book_time);
        
        for(int i=0; i<1440; i++) {
            answer = Math.max(answer, timeTable[i]);
        }
        
        
        return answer;
    }
    
    int toMinute(String time) {
        int sum = 0;
        sum += (time.charAt(0)-'0') * 600;
        sum += (time.charAt(1)-'0') * 60;
        sum += (time.charAt(3)-'0') * 10;
        sum += (time.charAt(4)-'0') * 1;
        
        return sum;
    }
    
    void schedule(String[][] book_time) {
        
        for(String[] time : book_time) {
            
            int inTime  = toMinute(time[0]);
            int outTime = toMinute(time[1]);
            
            System.out.println(inTime + ", " + outTime);
            
            for(int i=inTime; i<=(outTime + 9); i++) {
                if(i >= 1440) timeTable[i-1440]++;
                else timeTable[i]++;
            }
        }
        
        
    }
    
    
}