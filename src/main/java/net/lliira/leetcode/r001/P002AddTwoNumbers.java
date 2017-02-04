package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;

/**
 You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
 order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 */
public class P002AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // create a place holder that always point to the first node in the result
        final ListNode head = new ListNode(0);
        ListNode prev = head;
        int remain = 0;
        while (l1 != null && l2 != null) {
            final int val = remain + l1.val + l2.val;
            prev.next = new ListNode(val % 10);
            prev = prev.next;
            remain = val / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode more = (l1 != null) ? l1 : ((l2 != null) ? l2 : null);
        while (more != null) {
            final int val = remain + more.val;
            prev.next = new ListNode(val % 10);
            prev = prev.next;
            remain = val / 10;
            more = more.next;
        }
        while (remain > 0) {
            prev.next = new ListNode(remain % 10);
            prev = prev.next;
            remain = remain / 10;
        }
        return head.next;
    }
}
