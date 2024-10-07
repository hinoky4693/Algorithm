class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;
        for(int i=0; i<code.length();i++){
            if (mode == false) {
                if (code.charAt(i)=='1'){
                    mode = !mode;
                } else if (i%2==0) {
                    answer += code.charAt(i);
                }
            } else {
                if (code.charAt(i)=='1'){
                    mode = !mode;
                } else if (i%2!=0) {
                    answer += code.charAt(i);
                }
            }
        }
        
        return (answer.length()==0) ? answer = "EMPTY" : answer;
    }
}