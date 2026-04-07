import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        
        int[] values = new int[N];
        int maxValue = 0;
        int sum = 0;
        for(int i = 0; i < N; i++){
            values[i] = Integer.parseInt(st.nextToken());
            maxValue = Math.max(values[i], maxValue);
            sum += values[i];
        }
        
        int M = Integer.parseInt(br.readLine());
        if(sum <= M) {
            System.out.println(maxValue);
            return;
        }
        
        
        int answer = 0;
        
        int left = 0;
        int right = maxValue;
        while(left <= right) {
            int mid = (left + right) / 2;
            
            int temp = 0;
            for(int i = 0; i < N; i++) {
                if(values[i] < mid) {
                    temp += values[i];
                } else {
                    temp += mid;
                }
                if(temp > M) {
                    temp = 0;
                    break;
                }
            }
            if (temp > 0) {
                answer = Math.max(answer, mid);
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(answer);
    }
}