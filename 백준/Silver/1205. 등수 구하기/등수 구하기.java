import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int newScore = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        if (P == 0) {
            System.out.println(-1);
            return;
        }

        int answer = -1;
        
        Integer[] scores = new Integer[N];
        if(N > 0) {
            st = new StringTokenizer(br.readLine());
        } else {
            answer = 1;
        }
        for(int i=0; i<N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(scores, Comparator.reverseOrder());

        outer:
        if(P == N) {
            for(int i=0; i<N; i++){
                if (scores[i] > newScore) continue;
                else if (scores[i] < newScore) {
                    answer = i+1;
                    break;
                }
                else {
                    if(i == N - 1) continue;
                    else {
			if(scores[i].intValue() == scores[N-1].intValue()) break outer;
                        answer = i+1;
                        break;
                    }
                    
                }
            }
        } else {
            answer = N + 1;
            for(int i=0; i<N; i++){
                if (scores[i] > newScore) continue;
                else if (scores[i] <= newScore) {
                    answer = i+1;
                    break outer;
                }
            }
        }
        
        System.out.println(answer);
    }
}