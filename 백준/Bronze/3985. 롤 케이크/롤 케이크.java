import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int N = sc.nextInt();
		int maxWishCount = 0;
		int wishCount = 0;
		int ans1 = 0;
		int ans2 = 0;
		int[] rollcake = new int[L];
		int num = 1;
		int[] count = new int[N+1];
		
		for(int i=1;i<=N;i++) {
			int Pi = sc.nextInt();
			int Ki = sc.nextInt();
			wishCount = Ki-Pi+1;
			if (wishCount > maxWishCount) {
				maxWishCount = wishCount;
				ans1 = i;
			}
			
			for(int j=Pi-1; j<=Ki-1; j++) {
				if(rollcake[j] == 0) {
					rollcake[j] = num;
				}
			}
			num++;
		}
		
		for(int k=0;k<rollcake.length;k++) {
			count[rollcake[k]]++;
		}
		
		int max = 0;
		for(int k=count.length-1;k>0;k--) {
			if (count[k] > max) max = count[k];
		}
		for(int k=count.length-1;k>0;k--) {
			if (count[k] == max) ans2 = k;
		}
		
		System.out.println(ans1);
		System.out.println(ans2);
	}
}
