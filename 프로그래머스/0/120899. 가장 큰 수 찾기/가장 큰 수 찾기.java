class Solution {
    public int[] solution(int[] array) {
        
        int biggest = 0;
        int idx = 0;
        for(int i=0;i<array.length;i++){
            if (array[i]>biggest){
                idx = i;
                biggest = array[i];
            }
        }
        int[] answer = {biggest, idx};
        return answer;
    }
}