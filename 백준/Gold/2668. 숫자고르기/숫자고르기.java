import java.util.*;
import java.io.*;

public class Main {
    static int[] arr;
    static boolean[] visited;
    static boolean[] visited2;
    static int answer = 0;
    static List<Integer> answerList;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        arr = new int[N+1];
        visited = new boolean[N+1];
        
        answerList = new ArrayList<>();
        for(int i=1; i<=N; i++){
            int curr = Integer.parseInt(br.readLine());
            arr[i] = curr;
            if (curr == i) {
                answerList.add(curr);
                answer++;
                visited[i] = true;
            }
        }
        List<Integer> list;
        for(int i = 1; i <= N; i++){
            list = new ArrayList<>();
            visited[i] = true;
            visited2 = visited.clone();
            list.add(i);
            check(i, arr[i], false, 1, list);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(answer+ "\n");
        
        answerList.sort((o1, o2) -> o1 - o2);
        
        for(int i=0; i<answerList.size(); i++){
            sb.append(answerList.get(i) + "\n");
        }
        System.out.println(sb);
        
    }
    static void check(int i, int j, boolean flag, int count, List list) {
        if (flag && i == j) {
            answer += count;
            answerList.addAll(list);
            return;
        }
        
        if(!visited2[j]) {
            list.add(j);
            visited2[j] = true;
            check(i, arr[j], true, count+1, list);
        }
    }
}