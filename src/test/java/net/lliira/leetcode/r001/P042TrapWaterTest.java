package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P042TrapWaterTest {
    private final P042TrapWater solution = new P042TrapWater();

    @Test
    public void tests() {
        test(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}, 6);
    }

    private void test(final int[] input, final int expected) {
        final int result = this.solution.trap(input);
        Assert.assertEquals(result, expected);
    }
}