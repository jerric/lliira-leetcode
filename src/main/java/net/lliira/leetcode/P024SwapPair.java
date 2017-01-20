package net.lliira.leetcode;

/**
 * Created by Jerric on 1/19/2017.
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
