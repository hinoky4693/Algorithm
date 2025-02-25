import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		String word = br.readLine();
		int sum = 0;
		int m = 1;
		
		for(int i=0;i<L;i++) {
			sum += ((int)(word.charAt(i)-'a') + 1) * m;
			m*=31;
		}
		System.out.println(sum);
	}
}
