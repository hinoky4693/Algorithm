import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[] arr = new int[20002];

        for(int num : nums) {
            arr[num + 10000]++;
        }

        for(int i=20001; i>=0; i--) {
            if(k > 0 && arr[i] > 0) {
                k -= arr[i];
                if(k <= 0) return i - 10000;
            }
        }
        return -1;
    }
}