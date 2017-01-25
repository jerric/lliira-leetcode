package net.lliira.leetcode.r101;

import net.lliira.leetcode.ListNode;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P141LinkCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            if (fast == head) return true;
            head = head.next;
            fast = fast.next.next;
        }
        return false;
    }
}
