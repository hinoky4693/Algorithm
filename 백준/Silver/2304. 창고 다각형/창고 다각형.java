import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        int[][] arr = new int[N][2];
        

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0]);
        int[] maxLeft = {0, 0};
        int[] maxRight = {0, 0};
        
        for(int i=0; i<N; i++){
            int[] curr = arr[i];
            if (curr[1] > maxLeft[1]) {
                maxLeft[0] = curr[0];
                maxLeft[1] = curr[1];
            }
            if (curr[1] >= maxRight[1]) {
                maxRight[0] = curr[0];
                maxRight[1] = curr[1];
            }
        }
        
        int maxL = arr[0][0];
        int maxH = arr[0][1];
        
        for(int i=1; i<N; i++){
            int[] curr = arr[i];
            if(curr[1] > maxH) {
                answer += (curr[0] - maxL) * maxH;
                maxL = curr[0];
                maxH = curr[1];
            }
            if(maxH == maxLeft[1]) break;
        }
        maxL = arr[N-1][0];
        maxH = arr[N-1][1];
        for(int i=N-2; i>=0; i--){
            int[] curr = arr[i];
            if(curr[1] > maxH) {
                answer += (maxL - curr[0]) * maxH;
                maxL = curr[0];
                maxH = curr[1];
            }
            if(maxH == maxRight[1]) break;
        }
        answer += (maxRight[0] - maxLeft[0] + 1) * maxLeft[1];
        System.out.println(answer);
    }
}