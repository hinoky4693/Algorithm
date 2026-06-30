import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        
        Map<String, String> chatMap = new HashMap<>();
        
        for(String val : record) {
            String[] curr = val.split(" ");
            
            String action = curr[0];
            String id = curr[1];
            if(!action.equals("Leave")){
                String nickname = curr[2];  
                chatMap.put(id, nickname);
            } 
        }
        
        List<String> answerList = new ArrayList<>();
        
        for(String val : record) {
            String[] curr = val.split(" ");
            
            String action = curr[0];
            String id = curr[1];
            if(action.equals("Enter")) answerList.add(chatMap.get(id)+"님이 들어왔습니다.");
            else if(action.equals("Leave")) answerList.add(chatMap.get(id)+"님이 나갔습니다.");
        }
        
        String[] answer = new String[answerList.size()];
        
        for(int i = 0 ; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        
        return answer;
    }
}
