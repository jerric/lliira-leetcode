package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;

import java.util.PriorityQueue;

/**
 Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 */
public class P023MergeKList {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        if (lists.length == 1) return lists[0];

        final ListNode head = new ListNode(0);
        ListNode node = head;
        final PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, (l, r) -> l.val - r.val);
        for (final ListNode list : lists) {
            if (list != null) queue.add(list);
        }
        while (!queue.isEmpty()) {
            node.next = queue.poll();
            node = node.next;
            if (node.next != null) queue.add(node.next);
        }
        return head.next;
    }
}
