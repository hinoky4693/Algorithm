class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = null;
        a = Integer.toString(n);
        for(int i=0;i<a.length();i++){
            answer += (int)a.charAt(i)-48;
        }
        
        return answer;
    }
}