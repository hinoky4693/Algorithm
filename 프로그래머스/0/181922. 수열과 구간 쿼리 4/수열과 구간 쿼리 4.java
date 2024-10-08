// 1. for(int i = 0; i<queries.length; i++){
// 2.   for(int j =queries[i][0]; j<queries[i][1]; j++){
// 3.       if (arr[j] % k == 0) arr[i]++;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i<queries.length; i++){
            for(int j =queries[i][0]; j<=queries[i][1]; j++){
                if (j % queries[i][2] == 0) arr[j]++;
            }
        }
        return arr;
    }
}