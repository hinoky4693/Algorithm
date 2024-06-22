class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countp=0;
        int county=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'p' || s.charAt(i) =='P'){
                System.out.println(s.charAt(i));
                countp++;
                
            } else if (s.charAt(i) == 'y' || s.charAt(i) =='Y'){
                System.out.println(s.charAt(i));
                county++;
            }
        }
        System.out.println(countp + ", " + county);
        if (countp == county) answer = true;
        else answer=false;
        

        return answer;
    }
}