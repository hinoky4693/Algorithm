import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        

        Queue<Integer> q = new LinkedList<>();
        
        List<Integer> speedList = new ArrayList<>();
        
        
        List<Integer> answerList = new ArrayList<>();
        
        for(int speed : speeds) {
            speedList.add(speed);
        }
        
        for(int progress : progresses) {
            q.add(progress);
        }
        
        
        
        while(!q.isEmpty()) {
            for(int speed : speedList) {
                q.add(q.poll() + speed);
            }
            
            int count = 0;
            while(!q.isEmpty() && q.peek() >= 100) {
                q.poll();
                speedList.remove(0);
                count++;
            }
            
            if(count != 0) answerList.add(count);
        }
        
        int[] answer = new int[answerList.size()];
        
        int index = 0;
        for(int num : answerList) {
            answer[index++] = num;
        }
        
        return answer;
    }
}