import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 위 칸 개수
        int K = Integer.parseInt(st.nextToken()); // 내구도 0인 칸이 K개 이상이면 종료

        int[] dur = new int[2 * N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2 * N; i++) dur[i] = Integer.parseInt(st.nextToken());

        boolean[] robot = new boolean[N]; // 0..N-1 (올리는 칸 0, 내리는 칸 N-1)

        int step = 0;
        int zeroCnt = 0;

        while (true) {
            step++;

            // 1) 벨트 + 로봇 회전
            int last = dur[2 * N - 1];
            for (int i = 2 * N - 1; i >= 1; i--) dur[i] = dur[i - 1];
            dur[0] = last;

            for (int i = N - 1; i >= 1; i--) robot[i] = robot[i - 1];
            robot[0] = false;
            robot[N - 1] = false; // 내리는 칸 로봇 내림

            // 2) 로봇 이동 (뒤에서부터)
            for (int i = N - 2; i >= 0; i--) {
                if (robot[i] && !robot[i + 1] && dur[i + 1] > 0) {
                    robot[i] = false;
                    robot[i + 1] = true;
                    dur[i + 1]--;
                    if (dur[i + 1] == 0) zeroCnt++;
                }
            }
            robot[N - 1] = false; // 이동 후에도 내리는 칸 내림

            // 3) 로봇 올리기
            if (!robot[0] && dur[0] > 0) {
                robot[0] = true;
                dur[0]--;
                if (dur[0] == 0) zeroCnt++;
            }

            // 4) 종료 조건
            if (zeroCnt >= K) break;
        }

        System.out.println(step);
    }
}
