import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        // 현재 입차 상태인 차량의 입차 시간을 저장하는 Map
        // key: 차량 번호, value: 입차 시간(분 단위)
        Map<String, Integer> inMap = new HashMap<>();
        
        // 차량별 총 주차 시간을 저장하는 Map
        // TreeMap을 사용하면 차량 번호가 자동으로 오름차순 정렬됨
        // key: 차량 번호, value: 누적 주차 시간
        Map<String, Integer> totalMap = new TreeMap<>();
        
        // records 배열을 하나씩 확인
        for (String record : records) {
            
            // "05:34 5961 IN"에서 시간 부분 추출
            String timeStr = record.substring(0, 5);
            
            // 차량 번호 추출
            String carNumber = record.substring(6, 10);
            
            // 입차/출차 상태 추출
            String status = record.substring(11);
            
            // "05:34" 같은 시간을 분 단위로 변환
            int time = parseTime(timeStr);
            
            // 입차 기록인 경우
            if (status.equals("IN")) {
                
                // 해당 차량의 입차 시간을 저장
                // 아직 출차하지 않은 상태라는 뜻
                inMap.put(carNumber, time);
                
            } else {
                
                // 출차 기록인 경우
                
                // 이전에 저장해둔 입차 시간 가져오기
                int inTime = inMap.get(carNumber);
                
                // 이번 주차 시간 계산
                int parkingTime = time - inTime;
                
                // 기존 누적 시간에 이번 주차 시간을 더해서 저장
                // 처음 출차하는 차량이면 기존 값이 없으므로 0부터 시작
                totalMap.put(
                    carNumber,
                    totalMap.getOrDefault(carNumber, 0) + parkingTime
                );
                
                // 출차했으므로 현재 입차 상태 Map에서 제거
                inMap.remove(carNumber);
            }
        }
        
        // 모든 기록을 확인한 뒤에도 inMap에 남아있는 차량은
        // 입차는 했지만 출차 기록이 없는 차량
        for (String carNumber : inMap.keySet()) {
            
            // 해당 차량의 마지막 입차 시간
            int inTime = inMap.get(carNumber);
            
            // 출차 기록이 없으면 23:59에 출차한 것으로 계산
            // 23:59는 23 * 60 + 59 = 1439분
            int parkingTime = 1439 - inTime;
            
            // 누적 주차 시간에 더해줌
            totalMap.put(
                carNumber,
                totalMap.getOrDefault(carNumber, 0) + parkingTime
            );
        }
        
        // 정답 배열 생성
        // 차량 개수만큼 요금이 필요함
        int[] answer = new int[totalMap.size()];
        
        int index = 0;
        
        // TreeMap이므로 차량 번호가 작은 순서대로 반복됨
        for (String carNumber : totalMap.keySet()) {
            
            // 해당 차량의 총 주차 시간
            int totalTime = totalMap.get(carNumber);
            
            // 총 주차 시간을 이용해 요금 계산 후 정답 배열에 저장
            answer[index++] = calcFee(totalTime, fees);
        }
        
        return answer;
    }
    
    // "HH:MM" 형식의 시간을 분 단위로 바꾸는 메서드
    public int parseTime(String hm) {
        int min = 0;
        
        // 예: "05:34"
        // hm.charAt(0) = '0', hm.charAt(1) = '5'
        // 시간 부분을 분으로 변환
        min += (hm.charAt(0) - '0') * 600; // 10시간 자리
        min += (hm.charAt(1) - '0') * 60;  // 1시간 자리
        
        // 분 부분 계산
        min += (hm.charAt(3) - '0') * 10;  // 10분 자리
        min += (hm.charAt(4) - '0');       // 1분 자리
        
        return min;
    }
    
    // 총 주차 시간을 이용해서 주차 요금을 계산하는 메서드
    public int calcFee(int totalTime, int[] fees) {
        
        // fees[0] = 기본 시간
        // fees[1] = 기본 요금
        // fees[2] = 단위 시간
        // fees[3] = 단위 요금
        
        // 총 주차 시간이 기본 시간 이하라면 기본 요금만 부과
        if (totalTime <= fees[0]) {
            return fees[1];
        }
        
        // 기본 시간을 초과한 시간
        int extraTime = totalTime - fees[0];
        
        // 초과 시간을 단위 시간으로 나눔
        // 나누어떨어지지 않으면 올림 처리해야 함
        // 예: 21분 / 10분 = 2.1 → 3번 요금 부과
        int extraCount = (int) Math.ceil((double) extraTime / fees[2]);
        
        // 기본 요금 + 추가 요금
        return fees[1] + extraCount * fees[3];
    }
}