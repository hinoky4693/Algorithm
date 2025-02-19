import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1;tc<=T;tc++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][N];
			
			for (int j = 0; j < N; j++) {
				String str = br.readLine();
				for (int i = 0; i < N; i++) {
					arr[j][i] = str.charAt(i) - '0';
				}
			}
			
			int midIdx = N/2;
			int sum = 0;
			for(int i=0;i<midIdx+1;i++) {
				for(int j=midIdx-i;j<=midIdx+i;j++) {
					sum += arr[i][j];
				}
			}
			
			for(int i=N-1;i>=midIdx+1;i--) {
				for(int j=midIdx-(N-1-i);j<=midIdx+(N-1-i);j++) {
					sum += arr[i][j];
				}
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(tc).append(" ").append(sum);
			System.out.println(sb);
		}
	}
}
