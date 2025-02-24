class Solution {
    public int[] solution(int[] num_list, int n) {
        int idx = 0;
        int size = (int)Math.ceil((double)num_list.length/n);
        int[] answer = new int[size];
        for(int i=0;i<num_list.length;i+=n) {
            answer[idx++] = num_list[i];
        }
        
        return answer;
    }
}