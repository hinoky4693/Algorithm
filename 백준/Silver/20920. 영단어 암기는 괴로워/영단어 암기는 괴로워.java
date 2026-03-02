import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Map<String, Integer> wordMap = new HashMap<>();
        for(int i = 0 ; i < N ; i ++) {
            String word = br.readLine();
            if(word.length() >= M) {
                wordMap.put(word, wordMap.getOrDefault(word, 0)+1);
            }
        }
        
        PriorityQueue<String> pq = new PriorityQueue<>((o1, o2) -> {
            if (wordMap.get(o1) == wordMap.get(o2)) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o2.length() - o1.length();
            }
            return wordMap.get(o2) - wordMap.get(o1);
        });
        
        for (String w : wordMap.keySet()) {
            pq.add(w);
        }
        
        StringBuilder sb = new StringBuilder();
        int size = pq.size();
        for (int i = 0; i < size; i++) {
            sb.append(pq.poll()).append("\n");
        }
        
        // pq 만든다
        // 컴퍼레이터 작성한다
        // map에서 keySet 뽑아서 pq에 넣는다
        // pq에서 하나씩 출력한다
        // 끄읕 -!
        
        System.out.println(sb.toString());

    }
}