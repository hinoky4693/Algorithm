class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int num = 0;
        int count = 0;
        for(int i=0;i<6;i++){
            if(lottos[i] == 0) {
                    count++;
                    continue;
            }
            for(int j=0;j<6;j++){
                if(win_nums[j] == lottos[i]) num++;
            }
        }
        switch(num) {
            case 2: {
                answer[1] = 5;
                break;
            }
            case 3: {
                answer[1] = 4;
                break;
            }
            case 4: {
                answer[1] = 3;
                break;
            }
            case 5: {
                answer[1] = 2;
                break;
            }
            case 6: {
                answer[1] = 1;
                break;
            }
            default: {
                answer[1] = 6;
            }
        }
        answer[0] = answer[1] - count;
        if (count == 6) answer[0] = 1;
        return answer;
    }
}