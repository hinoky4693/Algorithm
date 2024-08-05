import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int[] sj = {a,b,c};
            Arrays.sort(sj);
            if (a*b*c == 0) {
                break;
            }

            if (sj[2]*sj[2] == sj[1]*sj[1] + sj[0]*sj[0]){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
            
            
            
        }
    }
}