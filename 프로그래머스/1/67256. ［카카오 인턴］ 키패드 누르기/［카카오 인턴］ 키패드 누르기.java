import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int[][] pos = { 
                          {3, 1},
                          {0, 0}, {0, 1}, {0, 2},
                          {1, 0}, {1, 1}, {1, 2},
                          {2, 0}, {2, 1}, {2, 2},
                      };
        StringBuilder sb = new StringBuilder();
        
        int[] currLeft  = {3, 0};
        int[] currRight = {3, 2};
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                sb.append("L");
                currLeft = pos[numbers[i]];                    
            }
            
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                sb.append("R");
                currRight = pos[numbers[i]];
            }
            
            else {
                if(Math.abs(pos[numbers[i]][0] - currLeft[0]) + Math.abs(pos[numbers[i]][1] - currLeft[1]) > Math.abs(pos[numbers[i]][0] - currRight[0]) + Math.abs(pos[numbers[i]][1] - currRight[1]) ) {
                    sb.append("R");
                    currRight = pos[numbers[i]];
                }
                else if(Math.abs(pos[numbers[i]][0] - currLeft[0]) + Math.abs(pos[numbers[i]][1] - currLeft[1]) < Math.abs(pos[numbers[i]][0] - currRight[0]) + Math.abs(pos[numbers[i]][1] - currRight[1])) {
                    sb.append("L");   
                    currLeft = pos[numbers[i]];
                }
                else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        currLeft = pos[numbers[i]];
                    }
                    else {
                        sb.append("R");
                        currRight = pos[numbers[i]];
                    }
                }
                    
                
                
            }
        }
        answer = sb.toString();
        return answer;
    }
}