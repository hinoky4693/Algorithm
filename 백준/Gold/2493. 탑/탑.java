import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] heights = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) heights[i] = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int cur = heights[i];

            while (!stack.isEmpty() && stack.peek()[0] < cur) {
                stack.pop();
            }

            if (stack.isEmpty()) sb.append("0 ");
            else sb.append(stack.peek()[1]).append(" ");

            stack.push(new int[]{cur, i + 1});
        }

        System.out.println(sb.toString());
    }
}
