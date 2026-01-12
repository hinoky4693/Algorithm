import java.util.*;
import java.io.*;

public class Main {
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= N; i++) {
            check(i);
        }
        
        System.out.println(answer);
    }
    
    public static void check(int a) {
        while(a > 0) {
            if (a % 10 == 3 || a % 10 == 6 || a % 10 == 9) answer++;
            a /= 10;
        }
    }
    
}