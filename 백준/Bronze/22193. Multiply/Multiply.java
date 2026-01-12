import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        BigInteger N = new BigInteger(br.readLine());
        BigInteger M = new BigInteger(br.readLine());
        
        System.out.println(N.multiply(M));
    }
}