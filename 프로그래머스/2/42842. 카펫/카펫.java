import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
            
        List<Integer> list = new ArrayList<>();
        
        int count = 1;
        while(count <= yellow) {
            if (yellow % count == 0) {
                list.add(count);
            }
            count++;
        }
        
        List<int[]> candidates = new ArrayList<>();
        
        for(int i=0; i<(list.size()+1)/2; i++) {
            if(list.size() % 2 == 1 && i == list.size()/2) {
                candidates.add(new int[] {list.get(i), list.get(i)});
            }
            candidates.add(new int[] {list.get(i), list.get(list.size() - i - 1)});
        }
        
        for(int i=0; i<candidates.size(); i++) {
            int[] candidate = candidates.get(i);
            if((candidate[0] + 2) * (candidate[1] + 2) == brown + yellow) {
                if (candidate[0] < candidate[1]) {
                    int temp = 0;
                    temp = candidate[0];
                    candidate[0] = candidate[1];
                    candidate[1] = temp;
                }
                return new int[]{candidate[0] + 2, candidate[1] + 2};
            }
        }
        return answer;
    }
    
    
}