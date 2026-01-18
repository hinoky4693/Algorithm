import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int answer = 0;
        int[] alphabetsWord = new int[26];
        String word = br.readLine();
        
        for(int i=0; i<word.length(); i++) {
            alphabetsWord[word.charAt(i)-65]++;
        }
        
        //System.out.println(Arrays.toString(alphabetsWord));
        
        outer:
        for(int i=0; i<N-1; i++){
            String compareWord = br.readLine();
	    if (word.length() > compareWord.length() + 1 || word.length() < compareWord.length() - 1)  continue outer;
            if (word.equals(compareWord)) {
                answer++;
                continue;
            }
            int[] alphabetsComp = new int[26];
            for(int j=0; j<compareWord.length(); j++) {
                alphabetsComp[compareWord.charAt(j)-65]++;
            }
            //System.out.println(Arrays.toString(alphabetsComp));
            int count = 0;
            for(int j=0; j<26; j++){
                if(alphabetsWord[j] > alphabetsComp[j] + 1 || alphabetsWord[j] < alphabetsComp[j] - 1) continue outer;
                if(alphabetsWord[j] == alphabetsComp[j] + 1 || alphabetsWord[j] == alphabetsComp[j] - 1) count++;
                if(count > 2) continue outer;
                if(j == 25 && count <= 2 ) answer++;
            }
        }
        System.out.println(answer);
    }
}