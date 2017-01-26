package net.lliira.leetcode.r151;

import net.lliira.leetcode.ListNode;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P155MinStack {

    private static class Item {
        final int val;
        final Item previous;
        Item(final int val, final Item previous) {
            this.val = val;
            this.previous = previous;
        }
    }

    private Item top = null;

    public void push(int x) {
        int min = (this.top == null) ? x : Math.min(x, this.top.previous.val);
        this.top = new Item(x, new Item(min, this.top));
    }

    public void pop() {
        if (this.top == null) return;
        this.top = this.top.previous.previous;
    }

    public int top() {
        return (this.top == null) ? 0 : this.top.val;
    }

    public int getMin() {
        return (this.top== null) ? 0 : this.top.previous.val;
    }

}
