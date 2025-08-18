class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int currDay = 4;
        for(int i=1;i<a;i++){
            currDay += days[i];
        }
        currDay += b - 1;
        currDay = currDay % 7;
        switch(currDay){
            case 0: {
                answer = "MON";
                break;
            }
            case 1: {
                answer = "TUE";
                break;
            }
            case 2: {
                answer = "WED";
                break;
            }
            case 3: {
                answer = "THU";
                break;
            }
            case 4: {
                answer = "FRI";
                break;
            }
            case 5: {
                answer = "SAT";
                break;
            }
            case 6: {
                answer = "SUN";
                break;
            }
        }
        return answer;
    }
}