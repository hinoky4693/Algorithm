import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] scores = new int[10];
		for(int i=0;i<10;i++) {
			scores[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += scores[i];
			if (sum > 100) {
				int diff1 = Math.abs(100-sum);
				int diff2 = Math.abs(100-(sum-scores[i]));
				
				if (diff1 <= diff2){
					System.out.println(sum);
				} else {
					System.out.println(sum-scores[i]);
				}
				return;
			} else if(sum == 100) {
				System.out.println(sum);
				return;
			} 
		}
		System.out.println(sum);
	
	}
}
