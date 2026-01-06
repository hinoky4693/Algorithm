import java.util.*;
import java.io.*;

class Main {

    
    static int answer = Integer.MAX_VALUE;
    static char[][] map;

    public static void main(String[] Args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
	map = new char[N][M];
        
        for(int i=0; i<N; i++){
            String currLine = br.readLine();
            for(int j=0; j<M; j++) {
                map[i][j] = currLine.charAt(j);
            }
        }
	
	for(int i=0; i<=N-8; i++){
	    for(int j=0; j<=M-8; j++){
	        answer = Math.min(answer, check(i ,j));
	    }
	}

	System.out.println(answer);
    }

    static int check(int startX, int startY) {
    int caseW = 0;
    int caseB = 0;

    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            char cur = map[startX + i][startY + j];

            char expectedW = ((i + j) % 2 == 0) ? 'W' : 'B';
            char expectedB = ((i + j) % 2 == 0) ? 'B' : 'W';

            if (cur != expectedW) caseW++;
            if (cur != expectedB) caseB++;
        }
    }

    return Math.min(caseW, caseB);
}
}