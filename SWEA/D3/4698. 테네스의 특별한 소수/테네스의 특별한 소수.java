import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String D = st.nextToken();
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			boolean[] isPrime = new boolean[B+1];
			Arrays.fill(isPrime, true);
			
			isPrime[0] = false;
			isPrime[1] = false;
			
			for(int i=2;i*i<=B;i++) {
				for(int j=i*i;j<=B;j+=i) {
					isPrime[j] = false;
				}
			}
			
			
			int ans = 0;
			
			for(int i=A; i<=B; i++) {
				if(isPrime[i] == true && String.valueOf(i).contains(D)) {
					ans++;
				}
			}
			
			System.out.println("#"+tc+" "+ans);
			
		}
	}
}