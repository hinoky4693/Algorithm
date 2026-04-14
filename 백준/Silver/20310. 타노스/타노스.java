import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] S = br.readLine().toCharArray();
        
        int count0 = 0;
        int count1 = 0;
        
        for(int i=0; i<S.length; i++) {
            if(S[i] == '0') count0++;
            else count1++;
        }
        
        StringBuilder sb = new StringBuilder();

        int count = 0;
        for(int i=0; i<S.length; i++) {
            if(S[i] == '1') {
                S[i] = '.';
                count++;
                if(count == count1/2) break;
            }
        }
        count = 0;
        for(int i=S.length-1; i>=0; i--) {
            if(S[i] == '0') {
                S[i] = '.';
                count++;
                if(count == count0/2) break;
            }
        }
        
        for(int i=0; i<S.length; i++) {
            if(S[i] == '.') continue;
            sb.append(S[i]);
        }
        
        System.out.println(sb.toString());
    }
}