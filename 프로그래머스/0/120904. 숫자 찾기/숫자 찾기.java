class Solution {
    public int solution(int num, int k) {
        
        String word = String.valueOf(num);
        for(int i=0;i<word.length();i++){
            if ((word.charAt(i)-'0') == k) return i+1;
        }
        return -1;
    }
}