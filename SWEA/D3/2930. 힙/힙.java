import java.util.*;
import java.io.*;


public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc<=T; tc++) {
			
			int N = Integer.parseInt(br.readLine());
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			System.out.print("#"+tc+" ");
			for(int z=0;z<N;z++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				if (st.nextToken().equals("1")) {
					pq.add(-Integer.parseInt(st.nextToken()));
				} else {
					if (pq.size() == 0) System.out.print("-1 ");
					else {
						System.out.print(-pq.poll()+" "); 
					}
				}
			}
			System.out.println();
		}
	}
}
