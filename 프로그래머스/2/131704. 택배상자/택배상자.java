import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 1; i <= order.length; i++) {
            q.add(i);
        }
        
        
        
        for(int i=0; i<order.length; i++) {
            while(true) {
                if(!q.isEmpty() && q.peek() != order[i]) {
                    if(!stack.isEmpty() && stack.peek() != order[i]) {
                        stack.add(q.poll());
                    } else if(!stack.isEmpty() && stack.peek() == order[i]) {
                        stack.pop();
                        answer++;
                        break;
                    } else if(stack.isEmpty()) {
                        stack.add(q.poll());
                    }             
                } else if(!q.isEmpty() && q.peek() == order[i]) {
                    q.poll();
                    answer++;
                    break;
                } else if(q.isEmpty()) {
                    if(stack.peek() != order[i]) return answer;
                    else {
                        stack.pop();
                        answer++;
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}