import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		outer:
		for(int tc = 1 ; tc <= T; tc++) {
			String func = br.readLine();
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			String line = br.readLine();
			StringBuilder sb = new StringBuilder();
			int idx = 0;
			for(int i=0;i<line.length();i++) {
				if (line.charAt(i) == '[' || line.charAt(i) == ']') continue;
				if (line.charAt(i) == ',') {
					arr[idx] = Integer.parseInt(sb.toString());
					sb.setLength(0);
					idx++;
				} else {
					sb.append(line.charAt(i));
				}
			}
			
			if (sb.length() != 0) {
				arr[idx] = Integer.parseInt(sb.toString());
			}
			
			Deque<Integer> dq = new LinkedList<>();
			for(int i=0;i<arr.length;i++) {
				dq.add(arr[i]);
			}
			boolean dir = false;
			
			for(int i=0;i<func.length();i++) {
				if (func.charAt(i) == 'R') dir = !dir;
				else if (func.charAt(i) == 'D') {
					if(dq.isEmpty()) {
						System.out.println("error");
						continue outer;
					}
					
					if(dir) dq.removeLast();
					else dq.removeFirst();
				}
			}
			sb.setLength(0);
			sb.append('[');
			int size = dq.size();
			for(int i=0;i<size;i++) {
				if (!dir) sb.append(dq.pollFirst());
				else sb.append(dq.pollLast());
				sb.append(',');
			}
			if(sb.length() != 1) sb.setLength(sb.length()-1);
			sb.append(']');
			System.out.println(sb);
		}
		
	}
}
