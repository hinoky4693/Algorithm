import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        Stack<Integer> stack = new Stack<>();
        stack.add(numbers[numbers.length-1]);
        answer[numbers.length-1] = -1;
        for(int i=numbers.length-2; i>=0; i--) {
            int curr = numbers[i];
            
            while(!stack.isEmpty()) {
                if(curr >= stack.peek()) {
                    stack.pop();
                } else if(curr < stack.peek()) {
                    answer[i] = stack.peek();
                    stack.add(curr);
                    break;
                }
            }
            
            if(stack.isEmpty()) {
                stack.add(curr);
                answer[i] = -1;
            }
        }
        return answer;
    }
}