class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        
        int scs = slice;
        while(slice/n<1) {
            answer++;
            slice = slice + scs;
        }
        
        return answer;
    }
}