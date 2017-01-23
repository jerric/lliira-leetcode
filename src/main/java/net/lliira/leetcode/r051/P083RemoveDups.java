package net.lliira.leetcode.r051;

import net.lliira.leetcode.ListNode;

/**
 * Created by Jerric on 1/23/2017.
 */
public class P083RemoveDups {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = head, node = head.next;
        while (node != null) {
            if (node.val == prev.val) {
                prev.next = node.next;
            } else {
                prev = node;
            }
            node = node.next;
        }
        return head;
    }
}
