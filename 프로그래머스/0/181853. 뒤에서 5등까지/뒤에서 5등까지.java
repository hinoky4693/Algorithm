import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] ans = new int[5];
        for(int i=0;i<ans.length;i++){
            ans[i]  = num_list[i];
        }
        return ans;   
        
    }
}