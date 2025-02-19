import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> passwords = new LinkedList<>();

		for (int tc = 1; tc <= 10; tc++) {
			StringBuilder sb = new StringBuilder();
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				passwords.add(Integer.parseInt(st.nextToken()));
			}

			int M = Integer.parseInt(br.readLine());

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < M; i++) {
				switch (st.nextToken()) {
				case "I":
					int x1 = Integer.parseInt(st.nextToken());
					int y1 = Integer.parseInt(st.nextToken());
					for (int k = 0; k < y1; k++) {
						passwords.add(x1, Integer.parseInt(st.nextToken()));
						x1++;
					}
					break;
				case "D":
					int x2 = Integer.parseInt(st.nextToken());
					int y2 = Integer.parseInt(st.nextToken());
					for (int k = 0; k < y2; k++) {
						passwords.remove(x2);
					}
					break;
				case "A":
					int y3 = Integer.parseInt(st.nextToken());
					for (int k = 0; k < y3; k++) {
						passwords.add(Integer.parseInt(st.nextToken()));
					}
				}
			}

			sb.append("#").append(tc).append(" ");
			for (int i = 0; i < 10; i++) {
				sb.append(passwords.poll()).append(" ");
			}
			System.out.println(sb);
		}
	}
}
