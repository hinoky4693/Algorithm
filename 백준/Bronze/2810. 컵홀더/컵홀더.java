import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String word = sc.next();
		
		int holder = 1;
		
		for(int i=0;i<word.length();) {
			if (word.charAt(i) == 'S') {
				holder++;
				i++;
			} else {
				holder++;
				i+=2;
			}
		}
		if (holder > word.length()) {
			holder = word.length();
		}
		System.out.println(holder);
	}
}
