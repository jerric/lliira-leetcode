package net.lliira.leetcode;

/**
 * Created by Jerric on 12/28/2016.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }
    public ListNode(int x, final ListNode next) {
        this(x);
        this.next = next;
    }
}
