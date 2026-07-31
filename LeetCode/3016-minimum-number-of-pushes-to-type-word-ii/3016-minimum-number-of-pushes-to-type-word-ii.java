import java.util.*;

class Solution {
    public int minimumPushes(String word) {
    
        int[][] alphabets = new int[26][2];

        for(int i=0; i<word.length(); i++) {
            alphabets[word.charAt(i) - 'a'][0] = word.charAt(i) - 'a';
            alphabets[word.charAt(i) - 'a'][1]++;
        }

        // System.out.println(Arrays.deepToString(alphabets));

        Arrays.sort(alphabets, (o1, o2) -> o2[1] - o1[1]);

        // System.out.println(Arrays.deepToString(alphabets));


        int idx = 0;
        int answer = 0;
        while(idx < 26) {
            if(alphabets[idx][1] == 0) break;
            answer += alphabets[idx][1] * (idx / 8 + 1);
            idx++;
        }

        return answer;
    }
}