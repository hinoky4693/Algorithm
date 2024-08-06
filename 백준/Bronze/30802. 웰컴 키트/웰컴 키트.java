import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int s = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int xl = sc.nextInt();
        int xxl = sc.nextInt();
        int xxxl = sc.nextInt();
        
        int t = sc.nextInt();
        int p = sc.nextInt();
        
        int shirts = 6;
        if (s==0){
            shirts--;
        }
        while (s>t) {
        	shirts++;
        	s-=t;
        }
        if (m==0){
            shirts--;
        }
        while (m>t) {
        	shirts++;
        	m-=t;
        }
        if (l==0){
            shirts--;
        }
        while (l>t) {
        	shirts++;
        	l-=t;
        }
        if (xl==0){
            shirts--;
        }
        while (xl>t) {
        	shirts++;
        	xl-=t;
        }

        if (xxl==0){
            shirts--;
        }
        while (xxl>t) {
        	shirts++;
        	xxl-=t;
        }
        if (xxxl==0){
            shirts--;
        }
        while (xxxl>t) {
        	shirts++;
        	xxxl-=t;
        }
        
        int penBundle = 0;
        int pen=0;
        penBundle = n/p;
        pen = n%p;
        System.out.println(shirts);
        System.out.println(penBundle + " " + pen);
        
    }
}