import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        
        Stack<Character> stack = new Stack<>();
        stack.add(s.charAt(0));
        
        Queue<Character> q = new LinkedList<>();
        for(int i=1; i<s.length(); i++){
            q.add(s.charAt(i));
        }
        
        
        while(!q.isEmpty()){
            
            if(stack.isEmpty()) {
                stack.add(q.poll());
                continue;
            }
            
            char prev = stack.peek();
            char curr = q.poll();
            if (curr != prev){
                stack.add(curr);
            } else {
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
        }
        
        System.out.println(stack);
        if (stack.isEmpty()) answer = 1;
        

        return answer;
    }
}