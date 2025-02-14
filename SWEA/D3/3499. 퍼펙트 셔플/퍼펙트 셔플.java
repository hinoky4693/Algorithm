import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			String[] cards = new String[N];
			for (int i = 0; i < N; i++) {
				cards[i] = sc.next();
			}

			int half1 = N - N / 2;
			int half2 = N / 2;

			String[] tempArr1 = new String[half1];
			String[] tempArr2 = new String[half2];

			for (int i = 0; i < half1; i++) {
				tempArr1[i] = cards[i];
			}
			for (int i = 0; i < half2; i++) {
				tempArr2[i] = cards[i + half1];
			}
			
			String[] answerArr = new String[N];
			int idx = 0;
			for (int i = 0; i < N; i++) {
				if (i + idx < N) {
					answerArr[i + idx] = tempArr1[i];
				}
				idx += 1;
			}
			idx = 1;
			for (int i = 0; i < N; i++) {
				if (i + idx < N) {
					answerArr[i + idx] = tempArr2[i];
				}
				idx += 1;
			}
			System.out.print("#"+tc+" ");
			for(int i=0;i<answerArr.length;i++) {
				System.out.print(answerArr[i]+" ");
			}
			System.out.println();
		}
	}
}
