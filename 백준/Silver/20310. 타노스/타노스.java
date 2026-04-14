import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String S = br.readLine();
        
        int count0 = 0;
        
        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i) == '0') count0++;    
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<(count0/2); i++) {
            sb.append('0');
        }
        
        for(int i=0; i<(S.length() - count0)/2; i++) {
            sb.append('1');
        }
        
        System.out.println(sb.toString());
    }
}