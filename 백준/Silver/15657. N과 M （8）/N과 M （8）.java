import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] data;
	static int[] sel;
	static int N, R;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		R = sc.nextInt();
		data = new int[N];
		sel = new int[R];
		
		
		for(int i=0;i<N;i++) {
			data[i] = sc.nextInt();
		}
		Arrays.sort(data);
		
		comb(0,0);
	}

	private static void comb(int idx, int sidx) {
		// 종료조건
		if(sidx == R) {
			for(int i=0;i<R;i++) {
				System.out.print(sel[i]+" ");
			}
			System.out.println();
			return;
		}
		// 재귀조건
		for(int i=idx;i<N;i++) {
			sel[sidx] = data[i];
			comb(i, sidx+1);
		}
		
	}
}
