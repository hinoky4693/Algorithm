import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String[][] words = new String[8][8];

		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			int count = 0;
			for (int i = 0; i < 8; i++) {
				words[i] = sc.next().split("");
			}

			for (int r = 0; r < 8; r++) {
				sb = new StringBuilder();
				for(int i=0;i<8;i++) {
					sb = new StringBuilder();
					for (int c = i; c < 8; c++) {
						sb.append(words[r][c]);
						if (sb.length() != N) continue; 		
						if (isReverse(sb) == true) count++;
					}
				}
			}

			for (int c = 0; c < 8; c++) {
				sb = new StringBuilder();
				for(int i=0;i<8;i++) {
					sb = new StringBuilder();
					for (int r = i; r < 8; r++) {
						sb.append(words[r][c]);
						if (sb.length() != N) continue; 		
						if (isReverse(sb) == true) count++;
					}
				}
			}

			System.out.println("#" + tc + " " + count);
		}
	}

	public static boolean isReverse(StringBuilder sb) {
		StringBuilder temp = new StringBuilder();
		temp.append(sb);
		temp.reverse();
		if (temp.toString().equals(sb.toString())) {
			return true;
		}
		return false;
	}

}
