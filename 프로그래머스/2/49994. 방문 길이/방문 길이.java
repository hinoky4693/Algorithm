class Solution {
    
    boolean[][][] visited;
    int[] curr;
    int answer;
    
    public int solution(String dirs) {
        
        visited = new boolean[11][11][4];
        curr = new int[] {5, 5};
        answer = 0;
        
        for(int i=0; i<dirs.length(); i++) {
            char dir = dirs.charAt(i);
            
            if(dir == 'U') {
                if(curr[1] + 1 > 10) continue;
                if(visited[curr[0]][curr[1] + 1][0]) {
                    curr[1]++;
                    continue;
                }
                visited[curr[0]][curr[1] + 1][0] = true;
                visited[curr[0]][curr[1]][2] = true;
                answer++;
                curr[1]++;
            }
            else if (dir == 'R') {
                if(curr[0] + 1 > 10) continue;
                if(visited[curr[0] + 1][curr[1]][1]) {
                    curr[0]++;
                    continue;
                }
                visited[curr[0] + 1][curr[1]][1] = true;
                visited[curr[0]][curr[1]][3] = true;
                answer++;
                curr[0]++;
            }
            else if (dir == 'D') {
                if(curr[1] - 1 < 0) continue;
                if(visited[curr[0]][curr[1] - 1][2]) {
                    curr[1]--;
                    continue;
                }
                visited[curr[0]][curr[1] - 1][2] = true;
                visited[curr[0]][curr[1]][0] = true;
                answer++;
                curr[1]--;
            }
            else if (dir == 'L') {
                if(curr[0] - 1 < 0) continue;
                if(visited[curr[0] - 1][curr[1]][3]) {
                    curr[0]--;
                    continue;
                }
                visited[curr[0] - 1][curr[1]][3] = true;
                visited[curr[0]][curr[1]][1] = true;
                answer++;
                curr[0]--;
            }
        }
        
        return answer;
    }
}