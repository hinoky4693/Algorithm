import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int ramda = Integer.parseInt(br.readLine());
        
        if(ramda < 425) System.out.println("Violet");
        else if(ramda < 450) System.out.println("Indigo");
        else if(ramda < 495) System.out.println("Blue");
        else if(ramda < 570) System.out.println("Green");
        else if(ramda < 590) System.out.println("Yellow");
        else if(ramda < 620) System.out.println("Orange");
        else if(ramda <= 780) System.out.println("Red");
        
    }
}