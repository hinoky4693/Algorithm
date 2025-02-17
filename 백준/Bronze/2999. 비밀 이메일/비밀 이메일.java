import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String words = sc.next();
		int n = words.length();
		
		List<Integer> elements = new ArrayList<>();
		
		int idx = 1;
		while(idx<=n) {
			if(n%idx == 0) {
				elements.add(idx);
			}
			idx++;
		}
		
		int r = elements.get(elements.size()/2);
		int c = n / r;
		
		char[][] newArr = new char[r][c];
		int newIdx = 0;
		for(int i = 0; i<r;i++) {
			for(int j=0;j<c;j++) {
				newArr[i][j] = words.charAt(newIdx);
				newIdx++;
			}
		}
		
		for(int j=0;j<c;j++) {
			for(int i = 0; i<r;i++) {
				System.out.print(newArr[i][j]);
			}
		}
		
	}
}
