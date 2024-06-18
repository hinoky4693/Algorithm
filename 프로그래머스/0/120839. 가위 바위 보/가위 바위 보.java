class Solution {
    public String solution(String rsp) {
        String answer = "";
        int n = rsp.length();
        
        for(int i=0;i<n;i++){
            if (rsp.charAt(i)=='0'){
                 answer=answer+"5";
            } else if(rsp.charAt(i)=='2'){
                 answer=answer+"0";
            } else if(rsp.charAt(i)=='5'){
                 answer=answer+"2";
            }
        }
        
        return answer;
    }
}