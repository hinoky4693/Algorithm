import java.util.HashSet;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc<= T; tc++) {
			int N = sc.nextInt();
			int M = N;
			HashSet<Character> hs = new HashSet<>();
			int count = 0;
			while(hs.size()<10) {
				for(char c : String.valueOf(N).toCharArray()) {
					hs.add(c);
				}
				count++; 
				N+=M;
			}
			System.out.println("#" + tc + " "+count*M);
		}
	}
}
