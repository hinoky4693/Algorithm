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

import java.util.*;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        dummy.next = new ListNode(0);
        ListNode curr = dummy.next;

        int carry = 0;
        int sum = 0;
        while(true) {

            sum = l1.val + l2.val + carry;
            carry = sum / 10;
            sum = sum % 10;

            curr.val = sum;

            if(l1.next != null) {
                l1 = l1.next;
            } else l1.val = 0;

            if(l2.next != null) {
                l2 = l2.next;
            } else l2.val = 0;
            
            if(l1.next == null && l2.next == null && l1.val == 0 && l2.val == 0) break;
            
            curr.next = new ListNode(0);
            curr = curr.next;
        }

        if (carry == 1) curr.next = new ListNode(1);

        return dummy.next;
    }
}