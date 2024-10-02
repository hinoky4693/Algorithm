// 1. str_list를 for문 돌린다.
// 2. ex를 contain하고 있는애는 빼고 answer에 더한다.

class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for (int i=0;i<str_list.length;i++) {
            if (str_list[i].contains(ex)){
                continue;
            } else {
                answer += str_list[i];
            }
        }
        
        
        return answer;
    }
}