// 1. for문 nomLog[i] numLog.length만큼 돌려버림. 
// 2. int diff = numLog[i+1] - numLog[i]
// 3. switch(diff){
// case 1: answer.append('w'); break;
// case 10: answer.append('d'); break;
// case -1: answer.append('s'); break;
// case -10: answer.append('a'); break;
//}

class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        for(int i=0;i<numLog.length;i++){
            if ((i+1) == numLog.length){
                break;
            }
            int diff = numLog[i+1] - numLog[i];
            switch(diff){
                case 1: answer.append('w'); break;
                case 10: answer.append('d'); break;
                case -1: answer.append('s'); break;
                case -10: answer.append('a'); break;
            }   
        }
        return answer.toString();
    }
}