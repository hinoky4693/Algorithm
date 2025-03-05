import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			String ans = "ON";
			int cnt = 0;
			while(cnt < N) {
				cnt++;
				if(M % 2 != 1) {
					ans = "OFF";
				}
				M /= 2;
			}
			System.out.println("#" + tc + " " + ans);
		}//tc
	}//main
}//class
