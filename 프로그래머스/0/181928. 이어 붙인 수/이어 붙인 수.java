class Solution {
    public int solution(int[] num_list) {
        String answer_odd = "";
        String answer_even = "";
        
        for(int i = 0 ; i<num_list.length;i++){
            if (num_list[i]%2==0){
                answer_even += (num_list[i]+"");
            } else {
                answer_odd += (num_list[i]+"");
            }
        }
        int answer = Integer.parseInt(answer_even) + Integer.parseInt(answer_odd);
        return answer;
    }
}