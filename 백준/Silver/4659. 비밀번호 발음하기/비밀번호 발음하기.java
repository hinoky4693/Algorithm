import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        StringBuilder sb = new StringBuilder();
        outer:
        while(true){
            String word = br.readLine();
            if (word.equals("end")) break;
            
            boolean flag = false;
            for(int i = 0; i < 5; i++){
                if (word.contains(String.valueOf(vowels[i]))) {
                    flag = true;
                    break;
                }
            }
            
            if(!flag) {
                sb.append("<").append(word).append("> is not acceptable.\n");
                continue;
            }
            
            int countVowel = 0;
            int countConsonant = 0;
            for(int i=0; i<word.length(); i++) {
                boolean type = false; // false = consonant, true = vowel
                for(int j = 0; j < 5; j++){
                    if(word.charAt(i) == vowels[j]) type = true;
                }
                if(type) {
                    countVowel++;
                    countConsonant = 0;
                    if(countVowel == 3) {
                        sb.append("<").append(word).append("> is not acceptable.\n");
                        continue outer;
                    }
                } else {
                    countConsonant++;
                    countVowel = 0;
                    if(countConsonant == 3) {
                        sb.append("<").append(word).append("> is not acceptable.\n");
                        continue outer;
                    }
                }
            }
            for(int i=0; i<word.length()-1; i++){
                if (word.charAt(i) == word.charAt(i+1)) {
                    if(word.charAt(i) == 'e' || word.charAt(i) == 'o') continue;
                    sb.append("<").append(word).append("> is not acceptable.\n");
                    continue outer;
                }
            }
            
            sb.append("<").append(word).append("> is acceptable.\n");
        }
        System.out.println(sb.toString());
    }
}