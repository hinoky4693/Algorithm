import java.util.*;

class Solution {
    public int largestInteger(int[] nums, int k) {

        int max = 0;
        if(nums.length == k) {
            for(int num : nums) {
                max = Math.max(num, max);
            }

            return max;
        }

        int[] count = new int[51];
        for(int i = 0; i <= nums.length - k; i++) {
            for(int j = i; j < i + k; j++) {
                count[nums[j]]++;
            }
        }   

        int answer = -1;
        for(int i=0; i<= 50; i++) {
            if(count[i] == 1) answer = Math.max(answer, i);
        }

        

        return answer;
    }
}