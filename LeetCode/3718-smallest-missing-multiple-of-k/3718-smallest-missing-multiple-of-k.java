import java.util.*;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, 1);
        }

        int temp = k;
        while(true) {
            if(map.containsKey(temp)) {
                temp += k;
                continue;
            } else return temp;
        }
        
    }
}