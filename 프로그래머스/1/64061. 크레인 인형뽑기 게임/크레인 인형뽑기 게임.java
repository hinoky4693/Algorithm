import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Queue[] qArr = new LinkedList[board.length+1];
        for(int i=1;i<=board.length;i++){
            qArr[i] = new LinkedList<Integer>();
        }
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if (board[j][i] != 0) qArr[i+1].add(board[j][i]);
            }
        }
        System.out.println(Arrays.deepToString(qArr));
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i : moves){
            if (qArr[i].isEmpty()) continue;
            Object tmp = qArr[i].poll();
            if(!stack.isEmpty()){
                if(stack.peek() == (int)tmp){
                    stack.pop();
                    answer+=2;
                } else {
                    stack.push((int)tmp);
                }
            } else {
                stack.push((int)tmp);
            }
        }
        
        
        return answer;
    }
}