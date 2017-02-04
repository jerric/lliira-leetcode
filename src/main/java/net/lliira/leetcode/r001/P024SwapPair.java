package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;

/**
 Given a linked list, swap every two adjacent nodes and return its head.

 For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.

 Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be
 changed.
 */
public class P024SwapPair {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        final ListNode holder = new ListNode(0);
        holder.next = head;
        ListNode left = holder, right = head.next, first;
        do {
            first = left.next;
            left.next = right;
            first.next = right.next;
            right.next = first;
            left = first;
            right = left.next;

            if (right != null) right = right.next;
        } while (right != null);
        return holder.next;
    }

}
