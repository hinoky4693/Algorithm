// 1. int i, int j, int k 선언 및 초기화 해줌. int[] answer도 선언. 길이는 commands.length;
// 2. commands를 for문 돌려서 temp의 길이부터 j-i+1로 해줘서 temp 선언.
// 3. for문 돌려서 temp 안에 i 부터 j 값까지 담아줌.
// 4. sort 해주고 k 번째 값 answer에 담아줌.

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int l = 0;
        int k = 0;
        for(int[] command : commands){
            int[] temp = new int[command[1]-command[0]+1];
            l = 0;
            for(int i=command[0]; i<=command[1];i++) {
                temp[l] = array[i-1];
                l++;
                if(l==(command[1]-command[0]+1)){
                    Arrays.sort(temp);
                    answer[k] = temp[command[2]-1];
                    k++;
                }
            }
        }
        
        return answer;
    }
}