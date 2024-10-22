// 1. switch문 사용.
// 2. age를 +"" 해줘서 String으로 바꿔줌.
// 3. for문을 age 길이만큼 돌려줌.
// 4. case에 맞춰서 0: answer += 'a', 1: answer += 'b' ... 9: answer += 'j'; 해주면 ggeut.

class Solution {
    public String solution(int age) {
        String answer = "";
        String temp = age+"";
        for(int i=0;i<temp.length();i++){
            switch(temp.charAt(i)){
                case '0': answer+='a'; break;
                case '1': answer+='b'; break;
                case '2': answer+='c'; break;
                case '3': answer+='d'; break;
                case '4': answer+='e'; break;
                case '5': answer+='f'; break;
                case '6': answer+='g'; break;
                case '7': answer+='h'; break;
                case '8': answer+='i'; break;
                case '9': answer+='j'; break;
            }
        }
        
        return answer;
    }
}