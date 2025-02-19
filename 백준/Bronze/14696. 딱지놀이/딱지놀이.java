import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String ans = null;
		for(int tc = 1; tc <= N; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			
			
			Integer[] aNum = new Integer[] {0,0,0,0,0};
			int data = 0;
			for(int i=0;i<a;i++) {
				data = Integer.parseInt(st.nextToken());
				aNum[data]++; 
			}
			
			
			st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			
			
			Integer[] bNum = new Integer[] {0,0,0,0,0};
			for(int i=0;i<b;i++) {
				bNum[Integer.parseInt(st.nextToken())]++; 
			}
			
			for(int i=4;i>=1;i--) {
				if(aNum[i] > bNum[i]) {
					ans = "A";
					break;
				}
				else if(aNum[i] < bNum[i]) {
					ans = "B";
					break;
				} 
				else {
					if(i == 3) ans = "D";
					continue;
				}
			}
			System.out.println(ans);
		}
	}
}
