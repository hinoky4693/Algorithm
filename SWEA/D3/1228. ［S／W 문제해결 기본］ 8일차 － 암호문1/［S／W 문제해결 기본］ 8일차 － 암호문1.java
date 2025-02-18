import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc = 1;tc<=10;tc++) {
			LinkedList<Integer> ll = new LinkedList<>();
			int N = sc.nextInt();
			for(int i=0;i<N;i++) {
				ll.add(sc.nextInt());
			}
			int commands = sc.nextInt();
			for(int i=0;i<commands;i++) {
				sc.next();
				int x = sc.nextInt();
				int y = sc.nextInt();
				for(int k=0;k<y;k++) {
					ll.add(x+k, sc.nextInt());
				}
			}
			
			System.out.print("#"+tc+" ");
			for(int i=0;i<10;i++) {
				System.out.print(ll.poll()+" "); 
			}
			System.out.println();
		}
	}
}
