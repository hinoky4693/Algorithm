import java.util.*;

class Solution {
    
    char[] sel;
    int size;
    boolean[] visited;
    char[] operator;
    List<Long> numList;
    List<Character> operList;
    String eexpression;
    long sum, max;
    
    public long solution(String expression) {
        long answer = 0;
        eexpression = expression;
        
        HashSet<Character> set = new HashSet<>();
        numList = new ArrayList<>();
        operList = new ArrayList<>();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<expression.length(); i++){
            char curr = expression.charAt(i);
            if(curr >= '0' && curr <= '9') {
                // System.out.println("벽느꼈다.");
                // System.out.println("네.");
                sb.append(String.valueOf(curr));
            }
            
            else if (curr < '0' || curr > '9') {
                set.add(curr);
                numList.add(Long.parseLong(sb.toString()));
                sb.setLength(0);
                operList.add(curr);
            }         
        }
        numList.add(Long.parseLong(sb.toString()));
        
        System.out.println("set " + set);
        System.out.println(numList);
        System.out.println(operList);
        
        size = set.size();
        
        operator = new char[size];
        
        int idx = 0;
        for(char c : set){
            operator[idx++] = c;
        }
        
        sel = new char[size];
        visited = new boolean[size];
        perm(0);
            
        return max;
    }
    
    public void perm(int sidx) {
        if (sidx == size) {
            System.out.println(Arrays.toString(sel));
            List<Long> nnumList = new ArrayList<>(numList);
            List<Character> ooperList = new ArrayList<>(operList);
            for(int j=0;j<size;j++){
                   
                int i = 0;
                // while(ooperList.size() >= 1){
                while(true){
                    
                    if(ooperList.get(i) == sel[j]){
                        long temp = calculate(nnumList.get(i), nnumList.get(i+1), ooperList.get(i));
                        ooperList.remove(i);
                        nnumList.set(i, temp);
                        nnumList.remove(i+1);
                    } else i++;
                    
                    if (ooperList.size() == 0 || i >= ooperList.size()) break;
                }
            }
            
            max = Math.max(max, Math.abs(nnumList.get(0)));
            sum = 0;
        }
        
        for(int i=0; i<size; i++){
            if(!visited[i]) {
                sel[sidx] = operator[i];
                visited[i] = true;
                perm(sidx + 1);
                visited[i] = false;    
            }
        }
    }
    
    public long calculate(long n1, long n2, char oper) {
        if (oper == '*') return n1 * n2;
        if (oper == '+') return n1 + n2;
        if (oper == '-') return n1 - n2;
        return 0;
    }
}