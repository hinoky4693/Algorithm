// 1. while(x!=1){ 일 때,
// 2. if (x%2==0) x /=2;
// 3. else x=3*x+1;
// 4. ArrayList 위에서 선언해서 while 문 안에서 하나씩 담음.

import java.util.*;
class Solution {
    public ArrayList solution(int n) {
        ArrayList answer = new ArrayList();
        do {
            answer.add(n);
            if (n%2==0){
                n/=2;
            } else {
                n = 3*n+1;
            }
        } while (n != 1);
        answer.add(n);
        return answer;
    }
}