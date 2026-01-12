import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        int tmp1 = -1 * A + (int)Math.sqrt(A*A-B);
        int tmp2 = -1 * A - (int)Math.sqrt(A*A-B);
        
        if (tmp1 != tmp2) System.out.println(Math.min(tmp1, tmp2) + " " + Math.max(tmp1, tmp2));
        else System.out.println(tmp1);
        
        
    }
}