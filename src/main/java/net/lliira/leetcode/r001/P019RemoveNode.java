package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;

/**
 * Created by Jerric on 1/17/2017.
 */
public class P019RemoveNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head, second = head;
        // advance first by n
        int i = 0;
        while (i < n && first != null) {
            first = first.next;
            i++;
        }
        if (first == null) {
            return (i < n) ? head : head.next; // N is out of range, or points to head
        }

        // advance first & second together till first reaches the end
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }

        if (second.next != null) second.next = second.next.next;
        return head;
    }
}
