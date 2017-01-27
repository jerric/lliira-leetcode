package net.lliira.leetcode.r201;

import java.util.Deque;

import net.lliira.leetcode.ListNode;

/**
 * Created by jerricg on 1/26/17.
 */
public class P225StackQueue {

    private int size = 0;
    private ListNode head = null, tail = null;

    /** Push element x onto stack. */
    public void push(int x) {
        if (size == 0) {
            head = tail = new ListNode(x);
        } else {
            tail.next = new ListNode(x);
            tail = tail.next;
        }
        size++;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        final int t = top();
        if (size == 1) head = tail = null;
        else head = head.next;
        size--;
        return t;
    }

    /** Get the top element. */
    public int top() {
        if (size == 0) throw new RuntimeException("Nothing to pop");
        int top = 0;
        for (int i = 1; i <=size; i++) {
            if (i == size) top = head.val;
            tail.next = head;
            head = head.next;
            tail = tail.next;
        }
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return (size == 0);
    }
}
