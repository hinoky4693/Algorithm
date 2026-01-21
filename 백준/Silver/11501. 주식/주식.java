import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] stocks = new int[N];
            for (int i = 0; i < N; i++) stocks[i] = Integer.parseInt(st.nextToken());

            long profit = 0;
            int maxPrice = 0;

            for (int i = N - 1; i >= 0; i--) {
                if (stocks[i] > maxPrice) {
                    maxPrice = stocks[i];
                } else {
                    profit += (maxPrice - stocks[i]);
                }
            }

            sb.append(profit).append('\n');
        }
        System.out.print(sb.toString());
    }
}