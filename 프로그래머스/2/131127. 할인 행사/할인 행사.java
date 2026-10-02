import java.util.*;

class Solution {
        
    Map<String, Integer> map;
    Map<String, Integer> answerMap;
    String[] want;
    int[] number;
        
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        map = new HashMap<>();
        answerMap = new HashMap<>();
        this.want = want;
        this.number = number;
        
        for(int i = 0; i < want.length; i++) {
            map.put(want[i], 0);
            answerMap.put(want[i], number[i]);
        }
        
        int idx = 9;
        
        for(int i=0; i<10; i++) {
            if(map.containsKey(discount[i])) {
                map.put(discount[i], map.get(discount[i]) + 1);
            }
        }
        
        int right = idx;
        int left = 0;
        
        while(right < discount.length) {
           if(check()) {
               answer++;
           }
            
           
            
           if(map.containsKey(discount[left])) {
               map.put(discount[left], map.get(discount[left]) - 1);
           }
           left++;
           
           right++;
           if(right == discount.length) break;
            
           if(map.containsKey(discount[right])) {
               map.put(discount[right], map.get(discount[right]) + 1);
           }
        }

        return answer;
    }
    
    public boolean check() {
        for(String str : answerMap.keySet()) {
            if(answerMap.get(str) != map.get(str)) return false;
        }
        
        return true;
    }
}