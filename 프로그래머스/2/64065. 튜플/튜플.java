import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] temp = s.split("}");
        List<String> tupleList = new ArrayList<>();

        for(String str : temp) {
            tupleList.add(str.substring(2,str.length()));
        }
        
        
        // for(int i=0;i<tupleList.size();i++){
        //     tupleList.split(",");
        // }
        
        Collections.sort(tupleList, (o1, o2) -> o1.length() - o2.length());
        
//         for(int i=0;i<tupleList.size();i++){
//             System.out.println(tupleList.get(i));
//         }

        Set<Integer> set = new HashSet<>();
    
        int[] answer = new int[tupleList.size()];
        int idx = 0;
        for (String str : tupleList) {
            String[] nums = str.split(",");
            for (int i = 0; i < nums.length; i++) {
                int num = Integer.parseInt(nums[i]);
                if (!set.contains(num)) {
                    set.add(num);
                    answer[idx++] = num;
                }
            }
        }
        
        
        return answer;
    }
}