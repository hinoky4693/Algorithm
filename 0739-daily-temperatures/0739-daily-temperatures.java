import java.util.*;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<int[]> stack = new ArrayDeque<>();

        int[] answer = new int[temperatures.length];

        stack.push(new int[] {temperatures[0], 0});

        for(int i=1; i<temperatures.length; i++) {
            int curr = stack.peek()[0];
            int next = temperatures[i];
        
            while(!stack.isEmpty() && stack.peek()[0] < next) {
                int[] temp = stack.pop();
                answer[temp[1]] = i - temp[1];
            }

            stack.push(new int[] {next, i});
        }

        while(!stack.isEmpty()) {            
            int[] temp = stack.pop();
            answer[temp[1]] = 0;
        }

        return answer;
    }
}