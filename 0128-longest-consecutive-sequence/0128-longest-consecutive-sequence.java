import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        
        if (nums.length == 0) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i : nums) {
            pq.add(i);
        }

        int max = 1;
        int answer = 1;

        int last = pq.peek();
        int curr = 0;
        while(!pq.isEmpty()) {
            curr = pq.poll();
            System.out.println(curr);

            if(curr == last) {
                last = curr;
                continue;
            }
            else if(curr == last + 1) max++;
            else {
                answer = Math.max(answer, max);
                max = 1;
            }

            last = curr;
        }

        return Math.max(answer, max);
    }
}