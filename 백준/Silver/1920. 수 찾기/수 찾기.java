import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr1 = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		int[] arr2 = new int[M];

		for (int i = 0; i < M; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr1);

		for (int i = 0; i < M; i++) {
			System.out.println(binarySearch(arr1, arr2[i]));
		}
	}

	public static int binarySearch(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;
		while(left<=right) {
			int mid = (left + right) / 2;
			if (arr[mid] == key) return 1;
			if (arr[mid] > key) right = mid - 1;
			else left = mid + 1;
		}
		return 0;
	}
}
