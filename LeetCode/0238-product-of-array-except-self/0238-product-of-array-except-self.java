import java.util.*;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int overAll = 1;
        int zeroCount = 0;
        int[] answer = new int[nums.length];

        for(int num : nums) {
            if (num == 0) zeroCount++;
            if (num == 0 && zeroCount == 1) continue;
            if (zeroCount >= 2) {
                return answer;
            }
            overAll *= num;
        }

        



        

        int idx = 0;
        for(int num : nums) {
            if(num == 0 && zeroCount == 1) answer[idx++] = overAll;

            else if(num != 0 && zeroCount == 1) answer[idx++] = 0;
            
            else answer[idx++] = overAll / num;
        }

        return answer;
    }
}