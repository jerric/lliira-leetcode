package net.lliira.leetcode.r151;

import net.lliira.leetcode.ListNode;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P160ListIntersect {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA, b = headB;
        int round = 0;
        while (round < 2) {
            if (a == b) return a;
            a = a.next;
            if (a == null) {
                a = headB;
                round++;
            }
            b = b.next;
            if (b == null) b = headA;
        }
        return null;
    }
}
