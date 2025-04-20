import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for(String intStr : intStrs){
            StringBuilder sb = new StringBuilder();
            for(int i=s;i<s+l;i++){
                sb.append(intStr.charAt(i));
            }
            if (Integer.parseInt(sb.toString()) > k){
                list.add(Integer.parseInt(sb.toString()));
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}