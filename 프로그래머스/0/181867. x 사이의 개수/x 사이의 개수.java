import java.util.*;

class Solution {
    public int[] solution(String myString) {
        int tmp = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<myString.length();i++){
            if (myString.charAt(i) != 'x') tmp++;
            else {
                list.add(tmp);
                tmp = 0;
            }
        }
        list.add(tmp);
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);            
        }
        return answer;
    }
}