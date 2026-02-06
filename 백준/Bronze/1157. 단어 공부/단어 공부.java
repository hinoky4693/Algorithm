  import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        word = word.toUpperCase();
        
        int[] arr = new int[26];
        for(int i=0; i<word.length(); i++){
            arr[word.charAt(i)-65]++;
        }
        int max = 0;
        for(int i=0; i<26; i++){
            max = Math.max(max, arr[i]);
        }
        char answer = '\u0000';
        for(int i=0; i<26; i++){
            if (answer != 0 && arr[i] == max) {
                System.out.println("?");
                return;
            }
	    if (arr[i] == max) answer = (char)((int)i+65);
            
        }
        System.out.println(answer);
        
    }
}