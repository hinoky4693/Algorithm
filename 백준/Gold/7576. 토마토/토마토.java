import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static Queue<int[]> q = new LinkedList<>();
	static int N, M;
	static int[][] map;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		map = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {

				int data = Integer.parseInt(st.nextToken());
				if (data == 1)
					q.add(new int[] { i, j });
				map[i][j] = data;
			}
		}
		
		int sum = bfs();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 0) {
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(sum);

	}

	private static int bfs() {
		int count = 0;
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				int[] curr = q.poll();

				for (int d = 0; d < 4; d++) {
					int nr = curr[0] + dr[d];
					int nc = curr[1] + dc[d];

					if (nr >= 0 && nc >= 0 && nr < N && nc < M && map[nr][nc] == 0) {
						q.add(new int[] { nr, nc });
						map[nr][nc] = 1;
					}
				}
			}
			count++;
		}

		return count-1;
	}
}
