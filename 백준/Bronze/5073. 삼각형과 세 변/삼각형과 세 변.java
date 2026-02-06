import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String curr;
        StringBuilder sb = new StringBuilder();
        while(!(curr = br.readLine()).equals("0 0 0")){
            StringTokenizer st = new StringTokenizer(curr);
            int[] sides = new int[3];
            for(int i=0; i<3; i++){
                sides[i] = Integer.parseInt(st.nextToken());    
            }
            
            Arrays.sort(sides);
            
            if (sides[2] >= sides[1] + sides[0]) {
                sb.append("Invalid").append("\n");
                continue;
            }
            Set<Integer> set = new HashSet<>();
            set.add(sides[0]);
            set.add(sides[1]);
            set.add(sides[2]);
            if(set.size() == 1) sb.append("Equilateral").append("\n");
            else if(set.size() == 2) sb.append("Isosceles").append("\n");
            else if(set.size() == 3) sb.append("Scalene").append("\n");
        }
        System.out.println(sb);
        
        
    }
}