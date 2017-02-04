package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;

/**
 Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes
 of the first two lists.
 */
public class P021MergeList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0), node = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        if (l1 != null) node.next = l1;
        else if (l2 != null) node.next = l2;
        return head.next;
    }
}
