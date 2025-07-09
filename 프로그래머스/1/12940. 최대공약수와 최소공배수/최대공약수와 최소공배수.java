class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {0, n*m};
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        for (int i = 1; i <= max; i++) {
            if (max % i == 0 && min % i== 0)
                answer[0] = i;
        }
        
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= min; j++) {
                 if (min * i == max * j) {
                     if (answer[1] > min * i) {
                        answer[1] = min * i;
                     }
                  }
            }
        }
        return answer;
    }
}