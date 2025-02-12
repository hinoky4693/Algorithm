import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1;tc<=T;tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[][] arr = new int[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int[] lengthRange = new int[N+1];
			int count = 0;
			
			for(int r=0;r<N;r++) {
				for(int c=0;c<N;c++) {
					if (arr[r][c] == 1) count++;
					else {
						lengthRange[count]++;
						count = 0;
					}
				}
				lengthRange[count]++;
				count = 0;
			}
			for(int c=0;c<N;c++) {
				for(int r=0;r<N;r++) {
					if (arr[r][c] == 1) count++;
					else {
						lengthRange[count]++;
						count = 0;
					}
				}
				lengthRange[count]++;
				count = 0;
			}
			
			System.out.println("#" + tc +" "+ lengthRange[K]);
		}
	}
}