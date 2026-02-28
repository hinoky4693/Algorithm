import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] order = new int[N];
            int[] cnt = new int[201];

            for (int i = 0; i < N; i++) {
                int team = Integer.parseInt(st.nextToken());
                order[i] = team;
                cnt[team]++;
            }

            // 후보 팀(완주 6명인 팀) 표시
            boolean[] candidate = new boolean[201];
            for (int team = 1; team <= 200; team++) {
                if (cnt[team] == 6) candidate[team] = true; // 문제 조건이 "정확히 6명"이면 ==6
                // 더 안전하게 하려면: if (cnt[team] >= 6) candidate[team] = true;
            }

            // 후보 팀 주자들만 대상으로 등수 부여하면서 점수 계산 (O(N))
            int[] finishCnt = new int[201];   // 후보팀 내에서 몇 번째로 들어왔는지
            int[] sum4 = new int[201];        // 상위 4명 점수 합
            int[] fifth = new int[201];       // 5번째 등수(동점 tie-break)

            int rank = 1; // 후보 팀 선수들에게만 매기는 등수

            for (int i = 0; i < N; i++) {
                int team = order[i];
                if (!candidate[team]) continue;

                finishCnt[team]++;

                if (finishCnt[team] <= 4) {
                    sum4[team] += rank;
                } else if (finishCnt[team] == 5) {
                    fifth[team] = rank;
                }
                rank++;
            }

            // 우승 팀 찾기: sum4 최소, 동점이면 fifth 최소
            int ansTeam = 0;
            int bestSum = Integer.MAX_VALUE;
            int bestFifth = Integer.MAX_VALUE;

            for (int team = 1; team <= 200; team++) {
                if (!candidate[team]) continue;

                if (sum4[team] < bestSum) {
                    bestSum = sum4[team];
                    bestFifth = fifth[team];
                    ansTeam = team;
                } else if (sum4[team] == bestSum) {
                    if (fifth[team] < bestFifth) {
                        bestFifth = fifth[team];
                        ansTeam = team;
                    }
                }
            }

            sb.append(ansTeam).append('\n');
        }

        System.out.print(sb.toString());
    }
}