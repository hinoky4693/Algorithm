import java.util.*;

class Solution {
    int size, answer;
    int[] nnumber;
    public int solution(int[] number) {
        answer = 0;
        size = number.length;
        nnumber = number;
        
        comb(0,0,0);
        return answer;
    }
    
    public void comb(int idx, int sidx, int sum){
        if (sidx == 3) {
            if(sum == 0) answer++;
            return;
        }
        
        for(int i=idx; i<size; i++){
            sum += nnumber[i];
            comb(i+1, sidx+1, sum);
            sum -= nnumber[i];
        }
    }
}