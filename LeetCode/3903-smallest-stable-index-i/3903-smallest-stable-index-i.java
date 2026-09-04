import java.util.*;

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            min = Math.min(min, num);
        }

        for(int i=0; i<nums.length; i++) {
            max = Math.max(max, nums[i]);

            if(max - min <= k) return i;

            if(nums[i] == min) {
                min = Integer.MAX_VALUE;
                for(int j = i + 1; j<nums.length; j++) {
                    min = Math.min(min, nums[j]);
                }
            }
        }

        return -1;
    }
}