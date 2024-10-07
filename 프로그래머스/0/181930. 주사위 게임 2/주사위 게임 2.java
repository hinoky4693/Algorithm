class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int[] dice = {a,b,c};
        
        if (a == b && a == c){
            answer = (a+b+c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        } else if (a==b && b!=c || a==c && a!=b || b==c && a!=b){
            answer = (a+b+c)*(a*a+b*b+c*c);
        } else {
            answer = a+b+c;
        }
        

        return answer;
    }
}