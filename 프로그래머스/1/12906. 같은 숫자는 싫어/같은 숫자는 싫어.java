// 1. 정답 담을 리스트 만듬. ArrayList temp = new ArrayList();
// 2. ArrayList 첫항에 arr[0] 담아줌.
// 3. for문 돌려서 temp에 arr[i] 담아 줄 건데, 
// 4. if (arr[i] != temp[temp.length-1]) 일 때만 담아줌.
// 5. 그러면 temp 완성 돼 있는거를 int[] answer에 담아주고 return.

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(arr[0]);
        for(int i=0;i<arr.length;i++){
            if(arr[i] != temp.get(temp.size()-1)){
                temp.add(arr[i]);
            }
        }
        int[] answer = new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            answer[i] = temp.get(i);
        }
        return answer;
    }
}