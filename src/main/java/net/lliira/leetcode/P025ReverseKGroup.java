package net.lliira.leetcode;

/**
 * Created by Jerric on 1/19/2017.
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
                count = 0;
            }
        }
        if (count != 0) {  // reverse the remaining nodes
            
        }
        return holder.next;
    }
}
