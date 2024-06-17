class Solution {
    public int[] solution(int n) {
        int num = 0;

        // 입력받은 n이 짝수인지 확인
        if (n % 2 == 0) {
            num = n; // n이 짝수이면 num에 n을 저장
        } else {
            num = n + 1; // n이 홀수이면 num에 n에 1을 더한 값을 저장
        }

        // 홀수의 개수는 num의 절반이므로 배열의 크기를 num/2로 설정
        int[] answer = new int[num / 2];
        
        // 배열에 홀수 채우기
        for (int i = 0; i < (num / 2); i++) {
            answer[i] = 2 * i + 1; // 홀수를 배열에 저장
        }
        
        return answer; // 결과 배열 반환
    }
}
