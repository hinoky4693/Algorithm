class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String[] lenStr = video_len.split(":"); // [0] = 분, [1] = 초
        int lenSec = Integer.parseInt(lenStr[0]) * 60 + Integer.parseInt(lenStr[1]); // 영상 길이
        
        String[] posStr = pos.split(":");
        int posSec = Integer.parseInt(posStr[0]) * 60 + Integer.parseInt(posStr[1]); // 현재 위치
        
        String[] startStr = op_start.split(":"); // [0] = 분, [1] = 초
        int startSec = Integer.parseInt(startStr[0]) * 60 + Integer.parseInt(startStr[1]); // 오프닝 시작
        
        String[] endStr = op_end.split(":"); // [0] = 분, [1] = 초
        int endSec = Integer.parseInt(endStr[0]) * 60 + Integer.parseInt(endStr[1]); // 오프닝 끝
        
        if(posSec >= startSec && posSec <= endSec) {
            posSec = endSec;
        }
        
        for(String command : commands){            
            if (command.equals("next")) {
                posSec += 10;
            } else {
                posSec -= 10;
            }
            
            if(posSec < 0) posSec = 0;
            if(posSec > lenSec) posSec = lenSec;
            
            if (posSec >= startSec && posSec <= endSec) {
                posSec = endSec;
            }
        }
        
        String min = (posSec / 60) + "";
        if(min.length() == 1){
            min = "0"+min;
        }
        String sec = (posSec % 60) + "";
        if(sec.length() == 1){
            sec = "0"+sec;
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(min).append(":").append(sec);
        
        return sb.toString();
    }
}