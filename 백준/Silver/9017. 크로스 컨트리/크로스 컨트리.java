import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> candidateList = new ArrayList<>();
            int[] scores = new int[N];
            int[] teamArr = new int[201];
            
            
            for(int i = 0; i<N; i++){
                int curr = Integer.parseInt(st.nextToken());
                scores[i] = curr;
                teamArr[curr]++;
            }
            
            for(int i = 1; i <= 200; i++){
                if (teamArr[i] == 6) {
                    candidateList.add(i);
                }
            }
            
            int[][] tempScore = new int[candidateList.size()][2];
            int[] numberFive = new int[candidateList.size()];
            int score = 1;
            for(int i = 0; i < scores.length; i++){
                for(int j = 0; j < candidateList.size(); j++) {
                    if(scores[i] == candidateList.get(j)) {
                        if(tempScore[j][1] < 4) {
                            tempScore[j][0] += score++;
                        } else if(tempScore[j][1] == 4) {
                            numberFive[j] = score++;
                        } else {
                            score++;
                        }
                        tempScore[j][1]++;
                    }
                }
            }
            
            int min = Integer.MAX_VALUE;
            int minFive = Integer.MAX_VALUE;
            int answer = 0;
            for(int i = 0; i < candidateList.size(); i++) {
                if(tempScore[i][0] < min) {
                    min = tempScore[i][0];
                    minFive = numberFive[i];
                    answer = candidateList.get(i);
                } else if(tempScore[i][0] == min) {
                    if(numberFive[i] < minFive) {
                        answer = candidateList.get(i);
                        minFive = numberFive[i];
                    }
                }
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb.toString());
    }
}