import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        for(String term : terms) {
            map.put(String.valueOf(term.charAt(0)), Integer.parseInt(term.substring(2)) * 28);
        }
        
        int todayInt = parseDay(today);
        
        int index = 0;
        for(String privacy : privacies) {
            
            String[] curr = privacy.split(" ");
            
            String date = curr[0];
            String term = curr[1];
            
            if((parseDay(date) + map.get(term) <= todayInt)) list.add(index+1);
            
            index++;
        }
        
        int[] answer = new int[list.size()];
        
        index = 0;
        for(int i : list) {
            answer[index++] = i;
        }
        
        return answer;
    }
    
    public int parseDay(String stringDay) {
        
        int year  = Integer.parseInt(stringDay.substring(0, 4));
        int month = Integer.parseInt(stringDay.substring(5, 7));
        int day   = Integer.parseInt(stringDay.substring(8));
        
        int data = 0;
        
        data = year * 12 * 28 + month * 28 + day;
        
        return data;
        
    }
}