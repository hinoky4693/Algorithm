// 1. for문 돌려서 (int i=1;i<=num_list.length;i+=2) 해서 ans1에 담음.(홀수 합)
// 2. for문 돌려서 (int i=2;i<=num_list.length;i+=2) 해서 ans2에 담음.(짝수 합)
// 3. if 문 해서 ans1 ans2중에 더 큰애 return.
class Solution {
    public int solution(int[] num_list) {
        int ans1=0;
        int ans2=0;
        
        for(int i=0;i<num_list.length;i+=2){
            ans1 += num_list[i];
        }
        for(int i=1;i<num_list.length;i+=2){
            ans2 += num_list[i];
        }
        
        if (ans1 > ans2){
            return ans1;
        } else {
            return ans2;
        }
    }
}