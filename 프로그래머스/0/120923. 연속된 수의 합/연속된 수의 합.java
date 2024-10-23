// answer num 길이만큼 선언. 
// for(int i = 0; i < num; i++){}
// 해서 num이 홀수인지 짝수인지 나눔.
// 홀수라면 answer[i] = total/num;
// 또 i가 홀수라면 answer[i] = total/num+(i/2+1);
// i가 짝수라면 answer[i] = total/num-(i/2);
// 
// 짝수라면 answer[i] = total/num;
// 또 i가 홀수라면 answer[i] = total/num+(i/2+1);
// i가 짝수라면 answer[i] = total/num-(i/2);
// answer sort해줌.

import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        for(int i = 0;i<num;i++){
            if (num%2==1){
                if(i%2 == 1){
                   answer[i] = total/num+(i/2+1);
                } else if(i%2==0 && i!=0){
                    answer[i] = total/num-(i/2);
                } else if(i==0){
                    answer[i] = total/num;
                }
                
            } else {
                if(i%2 == 1){
                   answer[i] = total/num+(i/2+1);
                } else if(i%2==0 && i!=0){
                    answer[i] = total/num-(i/2);
                } else if(i==0){
                    answer[i] = total/num;
                }
            }
        }
        Arrays.sort(answer);
        
        return answer;
    }
}