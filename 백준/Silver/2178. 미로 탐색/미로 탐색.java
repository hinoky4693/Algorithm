import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[] dr = { 1, -1, 0, 0 };
	static int[] dc = { 0, 0, 1, -1 };
	static boolean[][] visited;
	static int[][] map;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		visited = new boolean[N + 1][M + 1];
		map = new int[N + 1][M + 1];
		for (int r = 1; r <= N; r++) {
			String line = br.readLine();
			for (int c = 1; c <= M; c++) {
				map[r][c] = line.charAt(c - 1) - '0';
			}
		}
		System.out.println(bfs(1, 1));
	}

	private static int bfs(int r, int c) {
		Queue<int[]> q = new LinkedList<>();
		visited[r][c] = true;
		q.add(new int[] { r, c });
		int count = 1;

		while (!q.isEmpty()) {
			int size = q.size();
			
			for (int i = 0; i < size; i++) {
				int[] curr = q.poll();
				for (int d = 0; d < 4; d++) {
					int nr = curr[0] + dr[d];
					int nc = curr[1] + dc[d];
					
					if(nr == N && nc == M) return count+1;
					
					if (nr < 1 || nr > N || nc < 1 || nc > M)
						continue;
					if (visited[nr][nc])
						continue;
					if (map[nr][nc] == 0)
						continue;
					visited[nr][nc] = true;
					q.add(new int[] { nr, nc });
				}
			}
			count++;
		}
		return -1;

	}
}
