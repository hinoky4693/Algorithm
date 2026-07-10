import java.util.*;

class Solution {
    
    int[] topping;
    
    public int solution(int[] topping) {
        int answer = 0;

        int size = topping.length;
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int[] asc = new int[size];
        int[] desc = new int[size];
        
        for(int i=0; i<size; i++) {
            set1.add(topping[i]);
            asc[i] = set1.size();
            
            set2.add(topping[size - 1 - i]);
            desc[size - 1 - i] = set2.size();
        }
        
        for(int i=0; i<size - 1; i++) {
            if(asc[i] == desc[i+1]) answer++;
        }

        
        return answer;
    }
    
    
}