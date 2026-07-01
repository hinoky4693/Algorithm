import java.util.*;

class Solution {
    
    boolean[] visited;
    String numbers;
    int answer;
    
    Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        
        
        visited = new boolean[numbers.length()];
        this.numbers = numbers;
        this.answer = answer;
        
        dfs("");
        
        // for(String num : set) {
        //     if(isPrime(Integer.parseInt(num))) answer++;
        // }
        answer = set.size();
        
        System.out.println(set);
        return answer;
    }
    
    public void dfs(String current) {
        
        for(int i=0; i<visited.length; i++) {
            if(!current.equals("")) {
                if(isPrime(Integer.parseInt(current))) {
                    set.add(Integer.parseInt(current));
                }
            }
            
            if(!visited[i]) {
                visited[i] = true;
                dfs(current + numbers.charAt(i));
                visited[i] = false;
            }          
        }
        
    }
    
    public boolean isPrime(int num) {
        
        if(num == 2) return true;
        
        if(num % 2 == 0 || num == 1) return false;
        
        for(int i=2; i<(num+1)/2; i++) {
            if(num % i == 0) return false;
        }
        
        return true;
    }
}