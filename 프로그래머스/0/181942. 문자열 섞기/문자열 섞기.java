// 1, Stringbuilder answer 선언.
// 2. for문 str1 길이만큼 돌려서 str1.charAt(i), str2.charAt(i) 더해줌.


class Solution {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<str1.length(); i++){
            answer.append(str1.charAt(i)).append(str2.charAt(i));
        }

        return answer.toString();
    }
}