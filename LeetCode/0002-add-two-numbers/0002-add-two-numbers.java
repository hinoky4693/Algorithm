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

        ListNode curr = new ListNode(0);
        StringBuilder sb = new StringBuilder();

        boolean overTen = false;
        int tmp = 0;
        while(true) {

            if(l1 == null) tmp = l2.val;
            else if(l2 == null) tmp = l1.val;
            else tmp = l1.val + l2.val;

            if(overTen) {
                tmp++;
                if(tmp >= 10) tmp -= 10;
                else overTen = false;

                curr.val = tmp;
                sb.append(tmp);
            } else {
                if(tmp >= 10) {
                    tmp -= 10;
                    overTen = true;
                }
                
                curr.val = tmp;
                sb.append(tmp);
            }

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;


            if(l1 == null && l2 == null) {
                if(overTen) {
                    ListNode abc = new ListNode(1, curr);
                    curr = abc;
                    sb.append(1);
                }
                break;
            }
            
            ListNode next = new ListNode(0, curr);

            
            curr = next;
        }

        ListNode answer = new ListNode(sb.charAt(sb.length() - 1) - '0');

        for(int i=sb.length() - 2; i >= 0; i--) {
            ListNode aaa = new ListNode(0, answer);
            answer = aaa;
            answer.val = sb.charAt(i) - '0';
        }


        return answer;
    }
}