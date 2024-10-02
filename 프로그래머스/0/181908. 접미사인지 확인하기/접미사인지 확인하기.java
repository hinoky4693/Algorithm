class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int leng = is_suffix.length();
        String made_string = "";
        
        if (leng>my_string.length()) {
            answer = 0;
            return answer;
        }
        
        for(int i=0;i<leng;i++){
            made_string += my_string.charAt(my_string.length()-leng+i);
        }
        
        System.out.println(made_string+", "+is_suffix);
        if (made_string.equals(is_suffix)) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        
        
        return answer;
    }
}