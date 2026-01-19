import java.util.*;
import java.io.*;

public class Main {
    static int N, K;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int answer = 0;
        
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

	Map<Integer, Integer> map = new HashMap<>();

	int left = 0;
	int max = 0;
	for(int i=0; i<N; i++){
	    map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
	    while(map.get(arr[i]) > K) {
		map.put(arr[left], map.getOrDefault(arr[left], 0) - 1);
		left++;
	    }
	    max = Math.max(max, i - left + 1);
	}

	System.out.println(max);

    }
}