import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if (n == 0) return;
			
			String[][] words = new String[n][2];
			for(int i=0; i<n; i++) {
				String word = br.readLine();
				words[i][0] = word;
				words[i][1] = word.toLowerCase();
			}
			
			Arrays.sort(words,(o1, o2) -> o1[1].compareTo(o2[1]));
			
			System.out.println(words[0][0]);
			
		}
	}
}
