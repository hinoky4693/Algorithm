class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        for(int num=i;num<=j;num++){
            sb.append(String.valueOf(num));
        }
        String word = sb.toString();
        for(int z=0;z<sb.length();z++){
            if (word.charAt(z) == (char)(k+'0')) answer++;
        }
        
        return answer;
    }
}