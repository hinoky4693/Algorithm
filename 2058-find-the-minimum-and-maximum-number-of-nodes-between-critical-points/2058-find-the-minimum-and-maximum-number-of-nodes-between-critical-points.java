import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int last = head.val;
        int curr = head.val;
        int next = -1;
        List<Integer> list = new ArrayList<>();

        int target = -1;
        int start = -1;
        int min = Integer.MAX_VALUE;

        int index = 0;
        while(head.next != null) {
            last = curr;
            curr = head.val;
            next = head.next.val;

            if(curr > last && curr > next) {
                if(target == -1) {
                    target = index;
                    start = index;
                }
                else {
                    if(min > index - target) {
                        min = Math.min(min, index - target);
                    }

                    target = index;
                }
            }
            if(curr < last && curr < next) {
                if(target == -1) {
                    target = index;
                    start = index;
                }
                else {
                    if(min > index - target) {
                        min = Math.min(min, index - target);
                    }

                    target = index;
                }
            }

            index++;

            head = head.next;
        }



        
        if(target == -1 || min == Integer.MAX_VALUE) return new int[] {-1, -1};
        

        return new int[] {min, target - start};
    }
}