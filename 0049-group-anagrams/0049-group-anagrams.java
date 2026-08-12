import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
   
        StringBuilder sb = new StringBuilder();

        String[][] tempArray = new String[strs.length][2];

        for(int i=0; i<tempArray.length; i++) {
            tempArray[i][0] = strs[i];
            tempArray[i][1] = strs[i];
        }

        for(int i=0; i<strs.length; i++) {
            char[] array = tempArray[i][0].toCharArray();
            Arrays.sort(array);
            for(int j=0; j<array.length; j++) {
                sb.append(array[j]);
            }
            tempArray[i][0] = sb.toString();
            sb.setLength(0);
        }
        

        Arrays.sort(tempArray, (o1, o2) -> o1[0].compareTo(o2[0]));
        System.out.println(Arrays.deepToString(tempArray));

        List<List<String>> answer = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        list.add(tempArray[0][1]);
        answer.add(list);

        int idx = 0;
        for(int i=1; i<strs.length; i++) {
            
            if(tempArray[i][0].equals(tempArray[i-1][0])) {
                answer.get(idx).add(tempArray[i][1]);
            } else {
                idx++;
                ArrayList<String> newList = new ArrayList<>();
                newList.add(tempArray[i][1]);
                answer.add(newList);
            }
        }

        return answer;

    }
}