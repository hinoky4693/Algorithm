/*
정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
*/
class Solution {
    public int[] solution(int n) {
        int num = 0;
        if (n%2 == 0){
            num = n;
        } else {
            num = n+1;
        }
        int[] answer = new int[num/2];
        
        for(int i=0;i<(num/2);i++){
            
            answer[i] = 2*i+1;
        }
        
        return answer;
    }
}
