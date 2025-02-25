import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		
		Loop:
		for (int tc = 1; tc <= T; tc++) {
			
			String[][] sudoku = new String[9][9];
			
			
			for (int r = 0; r < 9; r++) {
				sudoku[r] = br.readLine().split(" ");
			}
			
			for(int r=0;r<9;r++) {
				set.clear();
				for(int c=0;c<9;c++) {
					set.add(sudoku[r][c]); 
				}
				
				if (set.size() != 9) {
					System.out.println("#"+ tc + " 0");
					continue Loop;
				}
			}
			for(int c=0;c<9;c++) {
				set.clear();
				for(int r=0;r<9;r++) {
					set.add(sudoku[r][c]); 
				}
				if (set.size() != 9) {
					System.out.println("#"+ tc + " 0");
					continue Loop;
				}
			}
			
			int[] dr = {-1,1,0,0,-1,-1,1,1};
			int[] dc = {0,0,1,-1,1,-1,-1,1};
			
			for(int r=1;r<8;r+=3) {
				for(int c=1;c<8;c+=3) {
					set.clear();
					set.add(sudoku[r][c]);
					for(int d=0;d<8;d++) {
						int nr = r + dr[d];
						int nc = c + dc[d];
						set.add(sudoku[nr][nc]);
					}
				}
				if (set.size() != 9) {
					System.out.println("#"+ tc + " 0");
					continue Loop;
				}
			}
			
			System.out.println("#"+tc+" 1");
			
		}

	}
}