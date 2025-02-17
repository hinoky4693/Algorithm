import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1;tc<=T;tc++) {
			String oxQuiz = sc.next();
			
			int score = 1;
			int sum = 0;
			for(int i=0;i<oxQuiz.length();i++) {
				if (oxQuiz.charAt(i) == 'O') {
					sum += score++;
				} else {
					score = 1;
				}
			}
			System.out.println(sum);
		}
	}
}
