package net.lliira.leetcode.r201;

import net.lliira.leetcode.ListNode;

/**
 * Created by Jerric on 1/26/2017.
 */
public class P234PalindromList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode first = head, second = revert(slow.next);
        while (second != null) {
            if (first.val != second.val) return false;
            first = first.next;
            second = second.next;
        }
        return true;
    }

    private ListNode revert(ListNode head) {
        ListNode node = head;
        head = null;
        while (node != null) {
            final ListNode next = node.next;
            node.next = head;
            head = node;
            node = next;
        }
        return head;
    }
}
