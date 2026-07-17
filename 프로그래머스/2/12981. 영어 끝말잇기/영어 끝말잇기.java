import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        
        Set<String> wordSet = new HashSet<>();
        int count = 1;
        
        String last = words[0];
        wordSet.add(last);
        
//         for(String word : words) {
//             if(wordSet.contains(word)) return new int[] {count % n + 1, count / n + 1};
            
//             if(last.charAt(last.length() - 1) != word.charAt(0)) return new int[] {count % n + 1, count / n + 1};
            
//             wordSet.add(word);
//             last = word;
//             count++;
//         }

        for(int i=1; i<words.length; i++) {
            String word = words[i];
            
            if(wordSet.contains(word)) return new int[] {count % n + 1, count / n + 1};
            
            if(last.charAt(last.length() - 1) != word.charAt(0)) return new int[] {count % n + 1, count / n + 1};
            
            wordSet.add(word);
            last = word;
            count++;
        }
        
        

        return answer;
    }
}