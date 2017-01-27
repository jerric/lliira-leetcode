package net.lliira.leetcode.r201;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P225StackQueueTest {
    private final P225StackQueue solution = new P225StackQueue();

    @Test
    public void tests() {
        this.solution.push(1);
        this.solution.push(2);
        Assert.assertEquals(this.solution.pop(), 2);
        this.solution.push(3);
        this.solution.push(4);
        Assert.assertEquals(this.solution.top(), 4);
        this.solution.push(5);
        this.solution.push(6);
        Assert.assertFalse(this.solution.empty());
        for (int i = 0; i < 5; i++) {
            Assert.assertEquals(this.solution.pop(), 6);
            Assert.assertEquals(this.solution.pop(), 5);
            Assert.assertEquals(this.solution.pop(), 4);
            Assert.assertEquals(this.solution.pop(), 3);
            Assert.assertEquals(this.solution.pop(), 1);
            Assert.assertTrue(this.solution.empty());
        }
    }
}