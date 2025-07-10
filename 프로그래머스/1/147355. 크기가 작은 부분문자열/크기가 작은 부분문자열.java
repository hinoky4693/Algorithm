class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        
        
        for(int j=0;j<t.length()-len+1;j++){
            long temp = 0;
            for(int i=j;i<j+len;i++){
                temp *= 10;
                temp += t.charAt(i)-'0';
            }
            if (temp <= Long.parseLong(p)) answer++;
        }
        
        return answer;
    }
}