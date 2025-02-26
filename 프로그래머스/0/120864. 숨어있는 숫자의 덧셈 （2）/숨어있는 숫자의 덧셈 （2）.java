class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int num = 0;

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (Character.isDigit(ch)) { // 숫자인 경우
                num = num * 10 + (ch - '0'); // 숫자를 하나로 합침
            } else { // 문자인 경우
                answer += num; // 이전 숫자를 더함
                num = 0; // 숫자 초기화
            }
        }

        answer += num; // 마지막 숫자 처리
        return answer;
    }
}
