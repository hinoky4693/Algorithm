import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int size = 0;
        for(int i=0;i<arr.length;i++){
            size += arr[i];
        }
        
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            int temp = arr[i];
            for(int j=0; j<temp;j++){
                ans.add(temp);
            }
        }
        
        int[] answer = new int[ans.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = ans.get(i);
        }
        
        
        
        return answer;
    }
}