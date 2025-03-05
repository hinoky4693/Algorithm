import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	static char[][] color;
	static int N, M;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());

			color = new char[N][M];
			for(int i=0;i<N;i++) {
				color[i] = br.readLine().toCharArray();
			} // color 담기
			
			char[] arr = new char[N];
			int ans = Integer.MAX_VALUE;
			for(int w=0;w<N-2;w++) {
				arr[w] = 'W';
				for(int b=w+1;b<N-1;b++) {
					arr[b] = 'B';
					for(int r=b+1;r<N;r++) {
						arr[r] = 'R';
					}
					
					ans = Math.min(ans, calc(arr)); 
				}
			}
			
			System.out.println("#"+tc+" "+ans);
			
			
		} // tc
	} // main

	
	public static int calc(char[] arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if (arr[i] == 'W') {
				for(int j=0;j<color[i].length;j++) {
					if(color[i][j] != 'W') count++;
				}
			}
			else if (arr[i] == 'B') {
				for(int j=0;j<color[i].length;j++) {
					if(color[i][j] != 'B') count++;
				}
			} else {
				for(int j=0;j<color[i].length;j++) {
					if(color[i][j] != 'R') count++;
				}
			}
		}
		return count;
	}

}
