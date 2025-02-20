import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	
	public static int N;
	public static String[] tree;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int tc=1; tc<=10;tc++) {
			N = Integer.parseInt(br.readLine());	// 정점 개수 N개 입력
			
			tree = new String[N+1];				// 트리 이차배열 선언
			
			
			for(int i=0;i<N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int p = Integer.parseInt(st.nextToken());	// 노드 번호
				String data = st.nextToken();		// 노드에 담길 데이터
				tree[p] = data;
			}
			
			System.out.print("#"+tc+" ");
			inOrder(1);
			System.out.println();
		}	// 테스트 케이스 tc 반복
		
	}

	private static void inOrder(int idx) {
		if (idx <= N) {
			inOrder(idx * 2);
			if(tree[idx] != null) {
				System.out.print(tree[idx]);
			}
			inOrder(idx * 2+1);
		}
	}
}
