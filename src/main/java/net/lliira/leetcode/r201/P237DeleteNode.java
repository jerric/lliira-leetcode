package net.lliira.leetcode.r201;

import net.lliira.leetcode.ListNode;

/**
 * Created by Jerric on 1/27/2017.
 */
public class P237DeleteNode {
    public void deleteNode(ListNode node) {
        if (node.next == null) return;
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
