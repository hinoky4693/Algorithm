import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int count = 1;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i) == ' '){
                count++;
            }
        }
        if (n.charAt(0) == ' ') count--;
        if (n.charAt(n.length()-1) == ' ') count--;
        System.out.println(count);
    }
}