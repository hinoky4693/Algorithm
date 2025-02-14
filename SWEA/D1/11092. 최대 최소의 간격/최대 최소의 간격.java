import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] nums = new int[N];
			for (int i = 0; i < N; i++) {
				nums[i] = sc.nextInt();
			}

			int min = Integer.MAX_VALUE;
			int minIdx = -1;
			for (int i = 0; i < N; i++) {
				if (nums[i] < min) {
					min = nums[i];
					minIdx = i;
				}
			}

			int max = Integer.MIN_VALUE;
			int maxIdx = -1;
			for (int i = N-1; i >= 0; i--) {
				if (nums[i] > max) {
					max = nums[i];
					maxIdx = i;
				}
			}
			
			System.out.println("#"+tc+" "+Math.abs(maxIdx-minIdx));

		}
	}
}
