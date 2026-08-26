import java.util.*;

class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left = 0;
        int right = 0;

        int cnt = 0;
        List<String> list = new ArrayList<>();
        StringBuilder sb  = new StringBuilder();
        while(left <= right) {
            if(right == s.length()) break;
            
            if(s.charAt(right) == '1') cnt++;
            sb.append(s.charAt(right));
            
            while(cnt == k) {
                list.add(sb.toString());
                if(s.charAt(left) == '1') cnt--;
                sb.deleteCharAt(0);
                left++;
            }

            right++;
        }


        list.sort((o1, o2) -> {
            if(o1.length() == o2.length()) return o1.compareTo(o2);
            return o1.length() - o2.length();
        });

        for(String str : list) {
            System.out.println(str);
        }
        
        if(list.size() == 0) return "";
        
        return list.get(0);
    }
}