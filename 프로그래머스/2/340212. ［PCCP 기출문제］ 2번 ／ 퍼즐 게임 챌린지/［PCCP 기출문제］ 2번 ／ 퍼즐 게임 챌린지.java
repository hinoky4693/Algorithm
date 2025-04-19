import java.util.*;

class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        return binarySearch(diffs, times, limit);
    }
    
    public static int binarySearch(int[] diffs, int[] times, long limit) {
        int left = 0;
        int right = 100001;
        int min = Integer.MAX_VALUE;
        
        while(left <= right){
            int mid = (left + right) / 2;
            if(func(mid, limit, diffs, times)){
                if (min > mid) min = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (min == 0) min = 1;
        return min;
    }
    
    public static boolean func(int level, long limit, int[] diffs, int[] times){
        long sec = times[0];
        for(int i=1;i<diffs.length;i++){
            if (diffs[i] <= level) sec += times[i];
            else {
               sec += (long)(diffs[i] - level) * (times[i-1] + times[i]) + times[i];
            }
            if (sec > limit) return false;
        }
        
        return sec <= limit;
    }
}