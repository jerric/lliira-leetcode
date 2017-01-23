package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;

/**
 * Created by Jerric on 12/28/2016.
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
