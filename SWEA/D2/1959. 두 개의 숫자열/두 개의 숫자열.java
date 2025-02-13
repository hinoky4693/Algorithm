import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc<=T;tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] A = new int[N];
			int[] B = new int[M];
			for(int i=0;i<N;i++) {
				A[i] = sc.nextInt();
			}
			for(int i=0;i<M;i++) {
				B[i] = sc.nextInt();
			}
			
			if (N < M) {
				int max = -1;
				for(int i=0;i<=B.length - A.length; i++) {
					int sum = 0;
					for(int j=0; j<A.length;j++) {
						sum += A[j] * B[j+i];
					}
					if (max < sum) max = sum;
				}
				
				System.out.println("#" + tc + " " + max);
				
				
				
				
				
			} else {
				int max = -1;
				for(int i=0;i<=A.length - B.length; i++) {
					int sum = 0;
					for(int j=0; j<B.length;j++) {
						sum += B[j] * A[j+i];
					}
					if (max < sum) max = sum;
				}
				
				System.out.println("#" + tc + " " + max);
			}
			
		
		}
				
	}
}
