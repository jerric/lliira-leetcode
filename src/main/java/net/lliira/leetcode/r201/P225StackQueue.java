package net.lliira.leetcode.r201;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

import net.lliira.leetcode.ListNode;

/**
 * Created by jerricg on 1/26/17.
 */
public class P225StackQueue {

    private final Queue<Integer> queue = new ArrayDeque<>();

    /** Push element x onto stack. */
    public void push(int x) {
        this.queue.offer(x);
        for (int i = 1; i < queue.size(); i++) {
            this.queue.offer(this.queue.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return this.queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return this.queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return this.queue.isEmpty();
    }
}
