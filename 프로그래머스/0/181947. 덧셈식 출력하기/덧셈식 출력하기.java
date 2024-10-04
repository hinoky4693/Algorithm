// 1. a, b를 입력 받는다.
// 2. a + b를 담을 c 초기화.
// 2. System.out.println(a + " + " + b); 사용
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();  
        int c = a+b;
        System.out.println(a + " + " + b + " = " + c);
    }
}