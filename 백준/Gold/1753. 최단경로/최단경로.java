import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static class Edge implements Comparable<Edge> {
		int e,w;

		public Edge(int e, int w) {
			super();
			this.e = e;
			this.w = w;
		}
		
		@Override
		public
		int compareTo(Edge o) {
			return this.w - o.w;
		}
	}
	static int V, E, K;
	static List<Edge>[] edges;
	static int[] dist;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(br.readLine());
		edges = new ArrayList[V+1];
		visited = new boolean[V+1];
		for(int i=0; i<=V;i++) {
			edges[i] = new ArrayList<>();
		}
		dist = new int[V+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		for(int i=0;i<E;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			edges[s].add(new Edge(e,w));
		}
		
		dist[K] = 0;
		
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		pq.add(new Edge(K, 0));
		
		while(!pq.isEmpty()) {
			Edge now = pq.poll();
			
			if(visited[now.e]) continue;
			visited[now.e] = true;
			
			for(Edge next : edges[now.e]) {
				if(dist[next.e] > dist[now.e] + next.w) {
					dist[next.e] = dist[now.e] + next.w;
					pq.add(new Edge(next.e, dist[next.e]));
				}
			}
		}
		
        for (int i = 1; i <= V; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
            } else {
                System.out.println(dist[i]);
            }
        }
		
	}
}
