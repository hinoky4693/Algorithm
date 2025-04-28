import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();
		List<String> numList = new ArrayList<>();
		List<Character> pmList = new ArrayList<>();
		for (int i = 0; i < line.length(); i++) {
			if(line.charAt(i) == '+' || line.charAt(i) == '-') {
				numList.add(sb.toString());
				sb.setLength(0);
				pmList.add(line.charAt(i));
			}
			else {
				sb.append(line.charAt(i));
			}
		}
		numList.add(sb.toString());
//		Collections.sort(numList);
//		Collections.sort(pmList);
//		System.out.println(numList.toString());
//		System.out.println(pmList.toString());
		
		int idx = 0;
		int sum = Integer.parseInt(numList.get(0));
		boolean check = false;
		for(int i=1;i<numList.size();i++) {
			if (pmList.get(idx) == '+' && !check) { // - 나온 적 없이 + 만 있는 경우
				sum += Integer.parseInt(numList.get(i));
			} else if(pmList.get(idx) == '+' && check) { // 앞에 -가 있었고, +만 연속으로 나왔을 수 있는 상태
				sum -= Integer.parseInt(numList.get(i));
			} else if(pmList.get(idx) == '-') {
				sum -= Integer.parseInt(numList.get(i));
				check = true;
			}
			idx++;
		}
		System.out.println(sum);
	}
}
