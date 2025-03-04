import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	static int N, L, flavor, cal, max;
	static int[][] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			N = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());

			arr = new int[N][2];

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = Integer.parseInt(st.nextToken());
			}

			for (int i = 0; i < (1 << N); i++) {
				for (int j = 0; j < N; j++) {
					if ((i & (1 << j)) > 0) {
						flavor += arr[j][0];
						cal += arr[j][1];
					}
				}

				if (cal <= L) {
					max = Math.max(max, flavor);
				}
				
//				System.out.println("flavor : " + flavor);
//				System.out.println("cal : " + cal);

				flavor = 0;
				cal = 0;

			}
			System.out.println("#"+ tc + " " + max);
			max = 0;
		}

	}
}
