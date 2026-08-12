import java.util.*;

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;
        int answer = 0;

        while(right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while(map.get(nums[right]) > k) {
                    map.put(nums[left], map.get(nums[left]) - 1);
                    left++;
            }

            answer = Math.max(right - left + 1, answer);
            right++;
        }

        return answer;
    }
}