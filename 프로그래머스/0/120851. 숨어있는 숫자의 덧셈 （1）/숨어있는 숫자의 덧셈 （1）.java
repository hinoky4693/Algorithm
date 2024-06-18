class Solution {
    public int solution(String my_string) {
        int n = my_string.length();
        int answer = 0;
        
        for(int i=0;i<n;i++){
            if(my_string.charAt(i)>='1' && my_string.charAt(i) <= '9'){
                answer = answer + (int)my_string.charAt(i)-48;
            }
        }
        
        
        return answer;
    }
}