class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        
        for(int i=0;i<schedules.length;i++) {
            int newTime = schedules[i];
            if (newTime % 100 >= 50) newTime += 50;
            else newTime += 10;
            boolean flag = true;
            for(int j=0;j<7;j++) {
                int day = (startday + j - 1) % 7 + 1;
                if (day == 6 || day == 7) continue;
                System.out.println(startday + j + " " + timelogs[i][j] + " " + newTime);
                if (timelogs[i][j] > newTime){
                    flag = false;
                    System.out.println("fail");
                    break;
                }
            }
            if(flag) answer++;
        }
        
        return answer;
    }
}