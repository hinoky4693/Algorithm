import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int check = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            if (num == 1) {
            	continue;
            }
            for(int j=2;j<num;j++) {

            	
            	if (num%j==0) {
            		check++;
            	}
            	
            }
            if (check == 0) {
            	count++;
            } else {
            	check = 0;
            }
        }
        System.out.println(count);
    }
}