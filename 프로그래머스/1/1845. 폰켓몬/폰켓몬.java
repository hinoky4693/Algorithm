import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Arrays.sort(nums);
        int answer = 1;
        for(int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]){
                answer++;
            }
        }
        
        if (answer > nums.length/2){
            answer = nums.length/2;
        }
        
        return answer;
    }
}