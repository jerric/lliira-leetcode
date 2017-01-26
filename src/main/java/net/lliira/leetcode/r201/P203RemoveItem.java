package net.lliira.leetcode.r201;

import net.lliira.leetcode.ListNode;

/**
 * Created by Jerric on 1/26/2017.
 */
public class P203RemoveItem {
    public ListNode removeElements(ListNode head, int val) {
        final ListNode holder = new ListNode(0);
        holder.next = head;
        ListNode prev = holder, node = head;
        while (node != null) {
            if (node.val == val) prev.next = node.next;
            else prev = node;
            node = node.next;
        }
        return holder.next;
    }
}
