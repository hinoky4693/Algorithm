import java.util.*;

class Solution {
    
    int size = 0;
    public int solution(String s) {
        int answer = 0;
        
        Queue<Character> q = new LinkedList<>();
        
        char[] arr = s.toCharArray();
        size = arr.length;
        
        for(char val : arr) {
            q.add(val);
        }
        
        for(int i=0; i<size; i++) {
            String temp = "";
            for(char c : q) {
                temp += c;
            }
            if(check(temp)) answer++;
            q.add(q.poll());
        }        
        
        return answer;
    }
    
    public boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<size; i++) {
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                stack.add(s.charAt(i));
            } else if(s.charAt(i) == ']') {
                if(!stack.isEmpty() && stack.peek() == '[') stack.pop();
                else return false;
            } else if(s.charAt(i) == '}') {
                if(!stack.isEmpty() && stack.peek() == '{') stack.pop();
                else return false;
            } else if(s.charAt(i) == ')') {
                if(!stack.isEmpty() && stack.peek() == '(') stack.pop();
                else return false;
            }
        }
        
        if(!stack.isEmpty()) return false;
        else return true;
    }
}