class Solution {
    int answer;
    public int solution(int[] mats, String[][] park) {
        answer = 0;
        for(int r=0; r<park.length; r++) {
            for(int c=0; c<park[0].length; c++) {
                if (park[r][c].equals("-1")) {
                    check(r, c, mats, park);
                }
            }
        }
        if (answer == 0) return -1; 
        return answer;
    }
    
    public void check(int r, int c, int[] mats, String[][] park) {
        boolean flag = true;
        outer:
        for(int i=0; i<mats.length; i++) {
            flag = true;
            for(int j=0; j<mats[i]; j++) {
                for(int m=0; m<mats[i]; m++) {
                    if(r+j >= park.length || c+m >= park[0].length) continue outer;
                    if(!park[r+j][c+m].equals("-1")) {
                        flag = false;
                        System.out.println("r+j : " + (r+j) + ", c+m : " + (c+m));
                        continue outer;
                    }
                }
            }
            if(flag) {
                answer = Math.max(answer, mats[i]);
            }
        }
    }
}