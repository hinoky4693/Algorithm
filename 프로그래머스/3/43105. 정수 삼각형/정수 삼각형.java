class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        int N = triangle.length;
        
        int[][] dp = new int[N][N];
        
        dp[0][0] = triangle[0][0];
        
        for(int r=1; r<N; r++) {
            for(int c=0; c<=r; c++) {
                if(c == 0) dp[r][c] = dp[r-1][c] + triangle[r][c];
                else {
                    dp[r][c] = Math.max(dp[r-1][c], dp[r-1][c-1]) + triangle[r][c];            
                }
            }
        }
        
        for(int i = 0; i < N; i++) {
            answer = Math.max(dp[N-1][i], answer);
        }
        
        return answer;
    }
}