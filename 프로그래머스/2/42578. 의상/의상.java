import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        for(String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }
        int sum = 1;
        for(String c : map.keySet()) {
            sum = sum * (map.get(c) + 1);
        }
        
        sum--;
        return sum;
    }
}