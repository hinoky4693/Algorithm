import java.util.*;

class Solution {
    public int solution(String s) {
        StringBuilder answer = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        map.put("zero", 0); map.put("one", 1); map.put("two", 2); map.put("three", 3); 
        map.put("four", 4); map.put("five", 5); map.put("six", 6); 
        map.put("seven", 7); map.put("eight", 8); map.put("nine", 9); 
        
        
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                answer.append(sb);
                sb.setLength(0);
                answer.append(String.valueOf(s.charAt(i)));
                continue;
            } // 숫자면 정답에 넣기
            
            if(map.get(sb.toString()) == null) {
                sb.append(String.valueOf(s.charAt(i)));
            }
            
            if(map.get(sb.toString()) != null) {
                answer.append(String.valueOf(map.get(sb.toString())));
                sb.setLength(0);
            }
            

        }
        
        return Integer.parseInt(answer.toString());
    }
}