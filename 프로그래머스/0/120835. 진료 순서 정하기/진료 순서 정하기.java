// 1. 정답 담을 answer배열 선언.
// 2. 순서 정할 large = 0 선언.
// 3. 우선순위 정할 rank=1; 선언
// 3. for문으로 emergency 돌려서 가장 큰 숫자 large에 담음.
// 4. indexOf(large) 해서 large의 index에 rank 넣고 rank++, emergency[indexOf(large)] = 0으로 바꿔줌.

import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int large, largeIndex;
        int rank = 1;

        // 배열의 길이만큼 반복
        for (int j = 0; j < emergency.length; j++) {
            large = 0;
            largeIndex = -1;

            // 가장 큰 값 찾기
            for (int i = 0; i < emergency.length; i++) {
                if (emergency[i] > large) {
                    large = emergency[i];
                    largeIndex = i; // 가장 큰 값의 인덱스 저장
                }
            }

            // rank와 해당 인덱스에 값을 저장
            if (largeIndex != -1) {
                answer[largeIndex] = rank;
                emergency[largeIndex] = 0; // 사용한 값은 0으로 설정
                rank++; // 다음 순위로 증가
            }
        }
        
        return answer;
    }
}