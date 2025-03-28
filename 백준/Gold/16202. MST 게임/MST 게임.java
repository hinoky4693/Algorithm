import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static class Edge implements Comparable<Edge> {
		int s, e, w;

		public Edge(int s, int e, int w) {
			super();
			this.s = s;
			this.e = e;
			this.w = w;
		}

		@Override
		public String toString() {
			return "Edge [s=" + s + ", e=" + e + ", w=" + w + "]";
		}

		@Override
		public int compareTo(Edge o) {
			return this.w - o.w;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		List<Edge> edges = new ArrayList<>();

		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			edges.add(new Edge(x, y, i));
		}
		Collections.sort(edges);

		int[] p = new int[N + 1];

		for (int k = 0; k < K; k++) {
			int pick = 0;
			int sum = 0;
			for (int i = 1; i <= N; i++) {
				p[i] = i;
			}
			for (int i = k; i < edges.size(); i++) {
				if (unionSet(edges.get(i).s, edges.get(i).e, p)) {
					pick++;
					sum += edges.get(i).w;
					if (pick == N - 1)
						break;
				}
			}
			if(pick < N - 1) sum = 0;
			System.out.print(sum+" ");
		}
	}

	private static int findSet(int v, int[] p) {
		if (p[v] == v)
			return v;
		return p[v] = findSet(p[v], p);
	}

	private static boolean unionSet(int v1, int v2, int[] p) {
		v1 = findSet(v1, p);
		v2 = findSet(v2, p);

		if (v1 == v2)
			return false;
		p[v1] = v2;
		return true;
	}
}
