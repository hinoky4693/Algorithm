
import java.util.*;
class Solution {
    public ArrayList solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<Integer>();
        int i = 0;
        while(i<arr.length){
           if (stk.size() == 0){
               stk.add(arr[i]);
               i++;
           } else if(stk.get(stk.size()-1)<arr[i]) {
               stk.add(arr[i]);
               i++;
           } else if (stk.get(stk.size()-1) >= arr[i]){
               stk.remove(stk.get(stk.size()-1));
           }
        }
        
        
        return stk;
    }
}