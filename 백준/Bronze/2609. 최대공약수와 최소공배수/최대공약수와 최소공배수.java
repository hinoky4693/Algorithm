import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cdgys = 0;
        int csgbs = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int data1 = Integer.parseInt(st.nextToken());
        int data2 = Integer.parseInt(st.nextToken());
        
        int max = Math.max(data1, data2);
        int min = Math.min(data1, data2);
        
        
        for(int i=1;i<=min;i++) {
        	if(data1 % i == 0 && data2 % i == 0) {
        		cdgys = i;
        	}
        }
        csgbs = (data1 / cdgys) * (data2 / cdgys) * cdgys;
        
        System.out.println(cdgys);
        System.out.println(csgbs);
    }
}