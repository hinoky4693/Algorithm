// 1. int tmp = 0; 초기화
// 2. for(int i=0;i<queries.length;i++){
//      arr[i][0] = tmp;
//      tmp = arr[i][1];
//      arr[i][1] = arr[i][0];
//}
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int tmp = 0;
        for(int i=0; i<queries.length; i++){
            tmp = arr[queries[i][1]];
            arr[queries[i][1]] = arr[queries[i][0]];
            arr[queries[i][0]] = tmp;
        }
        return arr;
    }
}