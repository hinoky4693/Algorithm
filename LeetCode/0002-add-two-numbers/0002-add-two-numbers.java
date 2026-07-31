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
        ListNode curr = dummy;

        int carry = 0;

        while (l1 != null || l2 != null) {

            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;

            int sum = num1 + num2 + carry;

            carry = sum / 10;
            int value = sum % 10;

            // 결과 리스트의 꼬리에 새 노드 추가
            curr.next = new ListNode(value);
            curr = curr.next;

            // 입력 리스트의 다음 노드로 이동
            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        // 마지막 올림이 남아 있는 경우
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummy.next;
    }
}