import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            if(i < min) min = i;
        }
        if (arr.length == 1) return new int[] {-1};
        int[] res = new int[arr.length-1];
        boolean flag = false;
        for(int i=0;i<res.length;i++){
            if(!flag && arr[i] != min){
                res[i] = arr[i];
            } else if(flag){
                res[i] = arr[i+1];
            } else {
                flag = true;
                i--;
                continue;
            }
        }
        return res;
        
    }
}