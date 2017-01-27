package net.lliira.leetcode.r201;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P232QueueStackTest {
    private final P232QueueStack solution = new P232QueueStack();

    @Test
    public void tests() {
        this.solution.push(1);
        this.solution.push(2);
        Assert.assertEquals(this.solution.pop(), 1);
        this.solution.push(3);
        this.solution.push(4);
        Assert.assertEquals(this.solution.peek(), 2);
        this.solution.push(5);
        this.solution.push(6);
        Assert.assertFalse(this.solution.empty());
        Assert.assertEquals(this.solution.pop(), 2);
        Assert.assertEquals(this.solution.pop(), 3);
        Assert.assertEquals(this.solution.pop(), 4);
        Assert.assertEquals(this.solution.pop(), 5);
        Assert.assertEquals(this.solution.pop(), 6);
        Assert.assertTrue(this.solution.empty());
    }
}