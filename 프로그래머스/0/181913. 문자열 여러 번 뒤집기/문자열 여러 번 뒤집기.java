// 1. for 문으로 queries 안에 query 돌려줌
// 2. 그 다음에 my_string 뒤집어야하는데, my_string.charAt(query[0]) / my_string.charAt(query[1])
// 3. while(query[0]<=query[1]) {query[0] query[1] 스왑; query[0]++; query[1]--;}
// 4. for문 만큼 돌려주고 return.

class Solution {
    public String solution(String my_string, int[][] queries) {
        char temp = 0;
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        for(int[] query : queries){
            i = query[0];
            j = query[1];
            while(i<=j){
                temp = sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,temp);
                i++;
                j--;
            }
        }
        
        return sb+"";
    }
}