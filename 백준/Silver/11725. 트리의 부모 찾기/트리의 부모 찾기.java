import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static int N;
	static List<Integer>[] edges;
	static int[] p;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		edges = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		p = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			edges[i] = new ArrayList<>();
		}

		for (int i = 0; i < N - 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			edges[a].add(b);
			edges[b].add(a);
		}
		p[1] = 1;
		dfs(1);
		for(int i=2;i<=N;i++) {
			System.out.println(p[i]);
		}
	}

	private static void dfs(int i) {
		visited[i] = true;

		for (int a : edges[i]) {
			if (visited[a])
				continue;
			if (p[a] == 0)
				p[a] = i;
			dfs(a);
		}
	}
}
