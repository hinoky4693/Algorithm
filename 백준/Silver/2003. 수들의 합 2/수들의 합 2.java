import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] nums = new int[N]; 
        for(int i=0;i<N;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        int ans = 0;
        outer:
        for(int i=0;i<N;i++){
            sum = 0;
            for(int j=i;j<N;j++){
                sum += nums[j];
                if(sum == M) {
                    ans++;
                    continue outer;
                }
            }
        }
        System.out.println(ans);
    }
}