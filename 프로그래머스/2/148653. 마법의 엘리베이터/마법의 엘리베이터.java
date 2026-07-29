class Solution {
    public int solution(int storey) {
        int answer = 0;

        while (storey > 0) {
            // 현재 처리할 가장 낮은 자리
            int digit = storey % 10;

            // 현재 자리를 제거하고 높은 자리만 남김
            storey /= 10;

            if (digit > 5) {
                // 위쪽으로 이동
                answer += 10 - digit;

                // 위로 이동했으므로 높은 자리에 올림 발생
                storey++;

            } else if (digit < 5) {
                // 아래쪽으로 이동
                answer += digit;

            } else {
                // digit == 5
                answer += 5;

                // 다음 자리가 5 이상이면 올림이 유리
                if (storey % 10 >= 5) {
                    storey++;
                }
            }
        }

        return answer;
    }
}