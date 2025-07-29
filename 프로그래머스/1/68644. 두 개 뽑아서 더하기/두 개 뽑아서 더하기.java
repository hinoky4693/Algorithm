import java.util.*;

class Solution {
    int size;
    int[] nnumbers;
    Set<Integer> set = new TreeSet<>();
    
    public int[] solution(int[] numbers) {
        nnumbers = numbers;
        size = numbers.length;
        
        comb(0,0,0);
        
        int[] answer = new int[set.size()];
        int idx = 0;
        for (int i : set){
            answer[idx] = i;
            idx++;
        }
        
        return answer;
    }
    
    public void comb(int idx, int sidx, int sum) {
        
        if(sidx == 2) {
            set.add(sum);
            return;
        }
        
        for(int i= idx; i < size; i++){
            sum += nnumbers[i];
            comb(i+1, sidx+1, sum);
            sum -= nnumbers[i];
        }
    }
    
    
}