import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = strings;
        Arrays.sort(answer);
        Arrays.sort(answer, (o1, o2) -> o1.charAt(n) - o2.charAt(n));
        return answer;
    }
}