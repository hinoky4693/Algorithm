import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int curr = -1;
        for(int i : arr) {
            if(i != curr) {
                curr = i;
                list.add(curr);
            }
        }
        
        // for(int i=0; i<list.size(); i++) {
        //     System.out.println(list.get(i));
        // }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}