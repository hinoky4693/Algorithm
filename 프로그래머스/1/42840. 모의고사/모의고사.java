import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {1, 3, 4, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        int index = 0;
        for(int answer : answers) {
            if (answer == pattern1[index%5]) count1++;
            index++;
        }
        
        index = 0;
        for(int answer : answers) {
            if (index % 2 == 0) {
                if(answer == 2) count2++;
            }
            else {
                if (answer == pattern2[(index/2)%4]) count2++;
            }
            index++;
        }
        
        index = 0;
        for(int answer : answers) {
            if (answer == pattern3[index%10]) count3++;
            index++;
        }
        
        List<Integer> answerList = new ArrayList<>();
        
        
        int max = 0;
        max = Math.max(Math.max(count1, count2), count3);
        
        if (count1 == max) {
            answerList.add(1);
        }
        if (count2 == max) {
            answerList.add(2);
        }
        if (count3 == max) {
            answerList.add(3);
        }
        
        int[] answer = new int[answerList.size()];
        
        index = 0;
        for(int i : answerList) {
            answer[index++] = i;
        }
        
        return answer;
    }
}