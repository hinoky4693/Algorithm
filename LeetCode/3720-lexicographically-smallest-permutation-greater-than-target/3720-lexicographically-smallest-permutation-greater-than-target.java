import java.util.*;

class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] sArr = new int[26];

        char[] temp = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char c : temp) {
            sArr[c - 'a']++;
        }

        for(int i=0; i<s.length(); i++) {
            int curr = target.charAt(i) - 'a';
            
            // 똑같은 애가 있다면 쓰기
            if(sArr[curr] > 0) {
                sb.append((char)(curr + 'a'));
                sArr[curr]--;
                continue;
            } 

            // 없다면 더 큰애 찾아보기
            int bigger = findBigger(curr, sArr);

            // 더 큰 애 있으면 넣기
            if(bigger != -1) {
                sb.append((char)(bigger + 'a'));
                sArr[bigger]--;
                
                sb = appendRemain(sb, sArr);

                return sb.toString();
            }

            // 현재로서는 답 없다 올라가야한다.
            for(int back = i - 1; back >=0; back--) {
                int restore = sb.charAt(sb.length() - 1) - 'a';

                sb.deleteCharAt(sb.length() - 1);
                sArr[restore]++;

                bigger = findBigger(target.charAt(back) - 'a', sArr);

                if(bigger != -1) {
                    sb.append((char)(bigger + 'a'));
                    sArr[bigger]--;

                    sb = appendRemain(sb, sArr);
                    return sb.toString();
                }
            }
            return "";
        }

        for(int back = target.length() - 1; back >= 0; back--) {

            int restore = sb.charAt(sb.length() - 1) - 'a';

            sArr[restore]++;
            sb.deleteCharAt(sb.length() - 1);

            int targetChar = target.charAt(back) - 'a';

            int bigger = findBigger(targetChar, sArr);

            if(bigger != -1) {

                sb.append((char)(bigger + 'a'));
                sArr[bigger]--;

                appendRemain(sb, sArr);

                return sb.toString();
            }
        }

        return "";
    }

    public int findBigger(int curr, int[] sArr) {
        for(int i=curr + 1; i<26; i++) {
            if(sArr[i] > 0) return i;
        }

        return -1;
    }

    public StringBuilder appendRemain(StringBuilder sb, int[] sArr) {
        for(int i = 0; i<26; i++) {
            while(sArr[i] > 0) {
                sb.append((char)(i + 'a'));
                sArr[i]--;
            }
        }

        return sb;
    }
}