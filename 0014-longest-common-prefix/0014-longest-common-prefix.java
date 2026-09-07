import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<strs[0].length(); i++) {
            String prefix = sb.append(strs[0].charAt(i)).toString();
            for(String str : strs) {
                if(!str.startsWith(prefix)) return prefix.substring(0, prefix.length() - 1);
            }
        }

        return strs[0];
    }
}