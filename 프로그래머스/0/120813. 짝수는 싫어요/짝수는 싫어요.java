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