package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;

/**
 Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

 k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a
 multiple of k then left-out nodes in the end should remain as it is.

 You may not alter the values in the nodes, only nodes itself may be changed.

 Only constant memory is allowed.

 For example,
 Given this linked list: 1->2->3->4->5

 For k = 2, you should return: 2->1->4->3->5

 For k = 3, you should return: 3->2->1->4->5
 */
public class P025ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k < 2) return head;
        final ListNode holder = new ListNode(0);
        holder.next = head;
        ListNode start = holder, top = null, node = head;
        int count = 0;
        while (node != null) {
            ListNode next = node.next;
            node.next = top;
            top = node;
            node = next;
            if (++count == k) {
                next = start.next;
                next.next = node;
                start.next = top;
                start = next;
                top = null;
                count = 0;
            }
        }
        if (count != 0) {  // reverse the remaining nodes
            node = top;
            top = null;
            while (node != null) {
                ListNode next = node.next;
                node.next = top;
                top = node;
                node = next;
            }
            start.next = top;
        }
        return holder.next;
    }
}
