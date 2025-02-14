import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1;tc<=T;tc++) {
			int N = sc.nextInt();
			int[] carrots = new int[N];
			for(int i=0;i<N;i++) {
				carrots[i] = sc.nextInt();
			}
			int max = Integer.MIN_VALUE;
			int count = 1;
			
			for(int i=0;i<N-1;i++) {
				if(carrots[i] < carrots[i+1]) {
					count++;
				} else {
					if(max < count) {
						max = count;
						count = 1;
					} else {
						count = 1;
					}
				}
			}
			if (max < count) max = count;
			System.out.println("#"+tc+" "+max);
		}
	}
}
