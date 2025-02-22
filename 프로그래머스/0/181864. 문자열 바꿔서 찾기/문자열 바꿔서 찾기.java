class Solution {
    public int solution(String myString, String pat) {
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<myString.length();i++){
            if(myString.charAt(i) == 'A'){
                sb.append('B');
            }
            else if(myString.charAt(i) == 'B'){
            sb.append('A');
        }   else {
            sb.append(myString.charAt(i));
        }
            } 
            
        String newString = sb.toString();
        if(newString.contains(pat)) return 1;
        else return 0;

    }
}