// 1. if (a*b %2 == 1)  answer = a*a + b*b;
// 2. else if (a*b % 2 == 0 && (a+b) % 2 == 1) answer = 2*(a+b);
// 3. else if (a*b % 2 == 0 && (a+b) % 2 == 0) answer = a>b ? a-b : b-a;
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if (a*b %2 == 1)  answer = a*a + b*b;
        else if (a*b % 2 == 0 && (a+b) % 2 == 1) answer = 2*(a+b);
        else if (a*b % 2 == 0 && (a+b) % 2 == 0) answer = a>b ? a-b : b-a;
        
        return answer;
    }
}