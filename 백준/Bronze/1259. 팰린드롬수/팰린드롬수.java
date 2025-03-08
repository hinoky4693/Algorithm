import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            StringBuilder sb = new StringBuilder();
            int data = Integer.parseInt(br.readLine());
            if (data == 0) break;
            
            sb.append(data+"");
            if(sb.toString().equals(sb.reverse().toString())) System.out.println("yes");
            else System.out.println("no");
        }
    }
}