package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;

/**
 Given a linked list, remove the nth node from the end of list and return its head.

 For example,

 Given linked list: 1->2->3->4->5, and n = 2.

 After removing the second node from the end, the linked list becomes 1->2->3->5.
 Note:
 Given n will always be valid.
 Try to do this in one pass.
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
