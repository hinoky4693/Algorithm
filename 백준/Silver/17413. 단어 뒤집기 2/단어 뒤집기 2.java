import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		StringBuilder tmp = new StringBuilder();
		
		boolean flag = false;
		
		for(int i=0;i<=word.length();i++) {
			if (i== word.length()) {
				sb.append(tmp.reverse());
				break;
			}
			char curr = word.charAt(i);
			
			if (curr == '<') {
				flag = true;
				sb.append(tmp.reverse()).append('<');
				tmp.setLength(0);
				continue;
			}
			
			if (curr == '>') {
				flag = false;
				sb.append('>');
				continue;
			}
			
			if (flag) {
				sb.append(word.charAt(i));
			}
			
			if (!flag && curr != ' ') {
				tmp.append(word.charAt(i));
			}

			if (!flag && curr == ' ') {
				sb.append(tmp.reverse()).append(' ');
				tmp.setLength(0);
			}
			
		}
		
		System.out.println(sb);
		
		
		
	}
}