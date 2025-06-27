import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map <Character, Integer> map = new HashMap<>();
        for(int i=65;i<=90;i++){
            map.put((char)i, -1);
        }
        for(int i=0;i<keymap.length;i++){
            for(int j=0;j<keymap[i].length();j++){
                if(map.get(keymap[i].charAt(j)) == -1){
                    map.put(keymap[i].charAt(j), j+1);
                }
                else if(map.get(keymap[i].charAt(j)) != -1 &&
                        j + 1 < map.get(keymap[i].charAt(j))){
                    map.put(keymap[i].charAt(j), j + 1);
                }
            }
        }
        for(int i=0;i<targets.length;i++){
            int sum = 0;

            for(int j=0;j<targets[i].length();j++){
                if(map.get(targets[i].charAt(j)) == -1) {
                    answer[i] = -1;
                    sum = -1;
                    break;
                }
                
                sum += map.get(targets[i].charAt(j));
            }
            answer[i] = sum;
        }
        return answer;
        
    }
}