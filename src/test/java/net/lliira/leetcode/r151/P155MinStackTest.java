package net.lliira.leetcode.r151;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P155MinStackTest {
    private final P155MinStack minStack = new P155MinStack();

    @Test
    public void test() {
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        Assert.assertEquals(minStack.getMin(), -3);
        minStack.pop();
        Assert.assertEquals(minStack.top(), 0);
        Assert.assertEquals(minStack.getMin(), -2);

    }
}
