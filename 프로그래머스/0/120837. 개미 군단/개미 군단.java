class Solution {
    public int solution(int hp) {
        int answer = 0;
        int a=0;
        int b=0;
        int c=0;
        a = hp/5;
        hp -= a*5;
        b = hp/3;
        hp -= b*3;
        c = hp%3;
        answer = a+b+c;
        
        return answer;
    }
}