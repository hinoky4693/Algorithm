import java.util.*;

class Solution {
    List<int[]> list = new ArrayList<>();
    int[][] map;
    
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        map = new int[rows][columns];
        int val = 1;
        for(int r=0; r<rows; r++) {
            for(int c=0; c<columns; c++) {
                map[r][c] = val++;
            }
        }
        int idx = 0;
        for(int[] query : queries) {
            list.clear();
            answer[idx++] = pick(query);
            rotate(query);
        }
        
        return answer;
    }
    
    int pick(int[] query) {
        int min = Integer.MAX_VALUE;

        int sr = query[0] - 1;
        int sc = query[1] - 1;
        int er = query[2] - 1;
        int ec = query[3] - 1;

        // 1. 위쪽: 왼쪽 → 오른쪽
        for (int c = sc; c <= ec; c++) {
            list.add(new int[]{sr, c});
            min = Math.min(min, map[sr][c]);
        }

        // 2. 오른쪽: 위 → 아래
        // 오른쪽 위 모서리는 이미 넣었으므로 sr + 1부터
        for (int r = sr + 1; r <= er; r++) {
            list.add(new int[]{r, ec});
            min = Math.min(min, map[r][ec]);
        }

        // 3. 아래쪽: 오른쪽 → 왼쪽
        // 오른쪽 아래 모서리는 이미 넣었으므로 ec - 1부터
        for (int c = ec - 1; c >= sc; c--) {
            list.add(new int[]{er, c});
            min = Math.min(min, map[er][c]);
        }

        // 4. 왼쪽: 아래 → 위
        // 양쪽 모서리는 이미 넣었으므로 er - 1부터 sr + 1까지
        for (int r = er - 1; r > sr; r--) {
            list.add(new int[]{r, sc});
            min = Math.min(min, map[r][sc]);
        }

        return min;
    } // 테두리 정해주는 애.
    
    void rotate(int[] query) {
        int[] last = list.get(list.size() - 1);
        int lastValue = map[last[0]][last[1]];

        for (int i = list.size() - 1; i >= 1; i--) {
            int[] curr = list.get(i);
            int[] prev = list.get(i - 1);

            map[curr[0]][curr[1]] = map[prev[0]][prev[1]];
        }

        int[] first = list.get(0);
        map[first[0]][first[1]] = lastValue;
    } // 테두리를 한바퀴 돌리는 애.
}