import java.util.*;

class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        
        int d = n - 1;
        int p = n - 1;
        
        int capD = cap;
        int capP = cap;
        
        while(d >= 0 || p >= 0) {
            
            while(d >= 0 && deliveries[d] <= 0) {
                d--;
            }
            
            while(p >= 0 && pickups[p] <= 0) {
                p--;
            }
            
            if(d < 0 && p < 0) break;
            
            capD = cap;
            capP = cap;
            
            answer += (Math.max(d, p) + 1) * 2;
            
            while(d >= 0 && capD > 0) {
                if(deliveries[d] >= capD) {
                    deliveries[d] -= capD;
                    capD = 0;
                } else {
                    capD -= deliveries[d];
                    deliveries[d] = 0;
                    d--;
                }    
            }
            
            while(p >= 0 && capP > 0) {
                if(pickups[p] >= capP) {
                    pickups[p] -= capP;
                    capP = 0;
                } else {
                    capP -= pickups[p];
                    pickups[p] = 0;
                    p--;
                }    
            }
        }
        
        
        return answer;
    }
}