import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i=0; i<discount.length - 9; i++) {
            sum = 0;
            map.clear();
            for(int j=i; j < i + 10; j++) {
                map.put(discount[j], map.getOrDefault(discount[j], 0) + 1);
            }
            
            // System.out.println(map);
            for(int k=0; k<want.length; k++) {
                if(map.getOrDefault(want[k], 0) == number[k]) {
                    sum += map.getOrDefault(want[k], 0);
                }
            }
            if(sum == 10) answer++;    
        }
        
        return answer;
    }
}