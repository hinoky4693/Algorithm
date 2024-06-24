import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 2;
        
        for(int i=1;i<n/2;i++){
            if ((double)n/i == i){
                System.out.println("n: " + n + "i: " + i);
                answer = 1;
            }
        }
        
        return answer;
    }
}