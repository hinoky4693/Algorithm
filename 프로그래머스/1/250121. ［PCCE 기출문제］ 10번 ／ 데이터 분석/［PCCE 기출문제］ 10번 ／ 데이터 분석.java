import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
 
        List<int[]> list = new ArrayList<>();
    
        int idx = -1;
        if(ext.equals("code")) idx = 0;
        else if(ext.equals("date")) idx = 1;
        else if(ext.equals("maximum")) idx = 2;
        else if(ext.equals("remain")) idx = 3;
        
        for(int[] i : data) {
            if(i[idx] < val_ext) list.add(i);
        }
        
        int[][] answer = new int[list.size()][4];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer, (o1, o2) -> {
            int i = -1;
            if (sort_by.equals("code")) i = 0;
            else if(sort_by.equals("date")) i = 1;
            else if(sort_by.equals("maximum")) i = 2;
            else if(sort_by.equals("remain")) i = 3;
            return o1[i] - o2[i];
        });
        
        
        
        return answer;
    }
}