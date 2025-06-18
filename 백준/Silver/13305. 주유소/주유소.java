import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] dist = new int[N-1];
		int[] cost = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<N-1;i++) {
			dist[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
			cost[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = cost[0];
		int ans = cost[0] * dist[0];
		for(int i=1;i<N-1;i++) {
			if (cost[i] < min) {
				min = cost[i];
			}
			ans += min * dist[i];
		}
		
		System.out.println(ans);
		
	}
}