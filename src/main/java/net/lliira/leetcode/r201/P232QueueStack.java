package net.lliira.leetcode.r201;

import java.util.Stack;

/**
 * Created by Jerric on 1/26/2017.
 */
public class P232QueueStack {

    private final Stack<Integer> output = new Stack<>();
    private final Stack<Integer> input = new Stack<>();

    /** Push element x to the back of queue. */
    public void push(int x) {
        this.input.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (this.output.isEmpty()) {
            while (!this.input.isEmpty()) this.output.push(this.input.pop());
        }
        return this.output.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (this.output.isEmpty()) {
            while (!this.input.isEmpty()) this.output.push(this.input.pop());
        }
        return this.output.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return this.output.isEmpty() && this.input.isEmpty();
    }
}
