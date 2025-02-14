import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append(a);
		StringBuilder sb2 = new StringBuilder();
		sb2.append(b);
		
		sb1.reverse();
		sb2.reverse();
		
		a = Integer.parseInt(sb1.toString());
		b = Integer.parseInt(sb2.toString());
		
		
		System.out.println(a > b ? a : b);  
	}
}
