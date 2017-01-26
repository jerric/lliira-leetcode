package net.lliira.leetcode.r201;

import net.lliira.leetcode.ListNode;

/**
 * Created by Jerric on 1/26/2017.
 */
public class P206ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode node = head.next;
        head.next = null;
        while (node != null) {
            final ListNode next = node.next;
            node.next = head;
            head = node;
            node = next;
        }
        return head;
    }
}
