import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();
        StringBuilder sWord = new StringBuilder();
        
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        
        for(int i=0;i<sArr.length;i++){
            sWord.append(sArr[i]);
        }
        
        sWord = sWord.reverse();
        
        return sWord.toString();
    }
}