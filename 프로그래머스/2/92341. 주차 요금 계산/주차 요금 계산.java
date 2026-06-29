import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        Map<String, Integer> inMap = new HashMap<>();
        Map<String, Integer> totalMap = new TreeMap<>();
        
        for(String record : records) {
            String time = record.substring(0, 5);
            String carNumber = record.substring(6, 10);
            String command = record.substring(11);
            
            if(command.equals("IN")) {
                inMap.put(carNumber, parseTime(time));
            }
            
            else {
                int totalTime = 0;
                totalTime = totalMap.getOrDefault(carNumber, 0) + parseTime(time) - inMap.get(carNumber);
                
                totalMap.put(carNumber, totalTime);
                inMap.remove(carNumber);
            }
        }
        
        for(String carNumber : inMap.keySet()) {
            int totalTime = 0;
            totalTime = totalMap.getOrDefault(carNumber, 0) + 1439 - inMap.get(carNumber);

            totalMap.put(carNumber, totalTime);
        }
        
        int[] answer = new int[totalMap.size()];
        int index = 0;
        for(String carNumber : totalMap.keySet()) {
            answer[index++] = calcFee(fees, totalMap.get(carNumber));
        }
        
        return answer;
    }
    
    public int parseTime (String time) {
        
        int totalMin = 0;
        
        totalMin += (time.charAt(0) - '0') * 600;
        totalMin += (time.charAt(1) - '0') * 60 ;
        totalMin += (time.charAt(3) - '0') * 10 ;
        totalMin += (time.charAt(4) - '0') * 1  ;
        
        return totalMin;
    }
    
    public int calcFee (int[] fees, int time) {
        
        int total = 0;
        
        if(time <= fees[0]) total += fees[1];
        else {
            total += fees[1];
            time -= fees[0];
            total += Math.ceil((double)time / fees[2]) * fees[3];
        }
        
        return total;
    }
        
}