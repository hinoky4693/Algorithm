class Solution {
    public long solution(long n) {
        long answer = 0;
        long tmp = (long)Math.sqrt(n);
        if (tmp * tmp == n) answer = (tmp + 1) * (tmp + 1);
        else answer = -1;
        return answer;
    }
}