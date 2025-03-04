import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			String[] nums = new String[N];
			
			nums = br.readLine().split(" ");
			
			
			
			int sum = 0;
			int count = 0;
			
			for (int i = 0; i < (1 << N); i++) {
				for (int j = 0; j < N; j++) {
					if((i & (1<<j)) > 0) {
						sum += Integer.parseInt(nums[j]);
					}
				}
				if (sum == K) {
					count++;
				}
				sum = 0;
			}
			
			System.out.println("#" + tc + " " + count);
		}
	}
}
