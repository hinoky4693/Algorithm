import java.util.*;


class Solution {
    public int[] solution(int[] answers) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        for(int i=0;i<answers.length;i++) {
            if (answers[i] == arr1[i%5]) count1++;
            if (answers[i] == arr2[i%8]) count2++;
            if (answers[i] == arr3[i%10]) count3++;
        }
        
        int[] arr = {count1, count2, count3};
        
        int max = Math.max(Math.max(count1, count2), count3);
        
        List<Integer> list = new ArrayList<>();
        
        
        for(int i=0;i<3;i++) {
            if (arr[i] == max) {
                list.add(i+1);        
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}