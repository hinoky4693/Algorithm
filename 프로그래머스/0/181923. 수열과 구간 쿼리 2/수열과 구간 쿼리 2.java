// 0. int min = 1000000 초기화;
// 1. for(int i=0;i<queries.length;i++){
//      for(int i=queries[i][0];i<=queries[i][1];i++){
//          if (arr[i]>k){
//              
//              if(min>arr[i]) min = arr[i];
//}
//}
//}


class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int min;
        int[] answer = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            min = 1000000;
            for(int j=queries[i][0];j<=queries[i][1];j++){
                if (arr[j]>queries[i][2] && min > arr[j]){
                    min = arr[j];
                }
            }
            
            answer[i] = (min == 1000000) ? -1 : min;
        }
            return answer;
    }
}