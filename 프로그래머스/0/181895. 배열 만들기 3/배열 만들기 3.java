import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int[] interval : intervals) {
            for(int i=interval[0]; i <= interval[1]; i++) {
                list.add(arr[i]);
            }
        }
        
        answer = new int[list.size()];
        
        int index = 0;
        for(int i : list) {
            answer[index++] = i;
        }
        
        return answer;
    }
}