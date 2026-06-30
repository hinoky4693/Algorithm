import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        Map<String, Set<String>> fromMap = new HashMap<>();
        Map<String, Set<String>> toMap   = new HashMap<>();
        
        
        
        for(String fromTo : report) {
            String[] val = fromTo.split(" ");
            
            
            fromMap.putIfAbsent(val[0], new HashSet<>());
            fromMap.get(val[0]).add(val[1]);
            
            toMap.putIfAbsent(val[1], new HashSet<>());
            toMap.get(val[1]).add(val[0]);
        }

        Map<String, Integer> idMap = new HashMap<>();
        
        for(String id : id_list) {
            idMap.put(id, 0);
        }
        
        for(String name : toMap.keySet()) {
            if(toMap.getOrDefault(name, new HashSet<>()).size() >= k) {
                
                for(String val : toMap.get(name)) {
                    idMap.put(val, idMap.getOrDefault(val, 0) + 1);
                }
                
            }
        }
        
        int[] answer = new int[id_list.length];
        int index = 0;
        for(String id : id_list) {
            answer[index++] = idMap.get(id);
        }
        
        return answer;
    }
}