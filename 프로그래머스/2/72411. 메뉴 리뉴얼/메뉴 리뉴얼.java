import java.util.*;

class Solution {
    
    char[] arr, sel, tempSel;
    int N;
    // boolean[] visited = new boolean[arr.length];
    Map<String, Integer> map = new HashMap<>();
    
    int maxNum;
    List<String> maxString = new ArrayList<>();
    List<String> answerList = new ArrayList<>();
    
    
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        
        // arr = new int[] {1, 2, 3, 4};
        // N = 2;
        // sel = new int[N];
        
        
        for(int num : course) {
            maxNum = 0;
            maxString.clear();
            for(String order : orders) {
                arr = order.toCharArray();
                N = num;
                sel = new char[N];
                
                comb(0, 0);
            }
            
            for(String max : maxString) {
                if(maxNum > 1) answerList.add(max);
            }
        }
        
        Collections.sort(answerList);
            
        answer = new String[answerList.size()];
        for(int i = 0 ; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
    
    public void comb(int idx, int sidx) {
        if(sidx == N) {
            String temp = "";
            tempSel = sel.clone();
            Arrays.sort(tempSel);
            for(char c : tempSel) {
                temp += c;
            }
            
            map.put(temp, map.getOrDefault(temp, 0) + 1);
            
            if(map.getOrDefault(temp, 0) > maxNum) {
                maxNum = map.getOrDefault(temp, 0);
                maxString.clear();
                maxString.add(temp);
            } else if (map.getOrDefault(temp, 0) == maxNum) {
                maxString.add(temp);
            }

            return;
        }
        
        for(int i = idx; i < arr.length; i++) {
            sel[sidx] = arr[i];
            comb(i + 1, sidx + 1);
        }
        
    }
}