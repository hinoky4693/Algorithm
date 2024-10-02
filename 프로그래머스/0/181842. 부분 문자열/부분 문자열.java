// 1. if str1.contains(str2) 사용.

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        if (str2.contains(str1)){
            return 1;
        } else return 0;
        
    }
}