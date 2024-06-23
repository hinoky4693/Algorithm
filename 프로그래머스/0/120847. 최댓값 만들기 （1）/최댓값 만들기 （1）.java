class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int a= 1;
        int b=-1;
        int max1=-1;
        int max2=-1;
        for(int i=0;i<numbers.length;i++){
            if (max1 < numbers[i]) max1 = numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            if (max2 < numbers[i] && numbers[i] != max1) max2 = numbers[i];
        }
        if (max2 == -1) max2 = max1;
        
        answer = max1*max2;
        return answer;
    }
}