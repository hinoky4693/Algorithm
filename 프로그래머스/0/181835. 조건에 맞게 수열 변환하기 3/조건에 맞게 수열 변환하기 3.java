// 1. for문으로 arr를 한번 돌린다.
// 2. k가 짝수라면 arr[i]에 k값을 더한다.
// 3. k가 홀수라면 arr[i]에 k값을 곱한다.


class Solution {
    public int[] solution(int[] arr, int k) {
        for(int i=0;i<arr.length;i++){
            if (k%2==0){
                arr[i] += k;
            } else{
                arr[i] *= k;
            }
        }
        return arr;
    }
}