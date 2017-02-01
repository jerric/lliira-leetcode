package net.lliira.leetcode.r451;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P495TeemoTest {
    private final P495Teemo solution = new P495Teemo();

    @Test
    public void tests() {
        test(new int[]{1, 4}, 2, 4);
        test(new int[]{1, 2}, 2, 3);
    }

    private void test(final int[] input, final int duration, final int expected) {
        final int result = this.solution.findPoisonedDuration(input, duration);
        Assert.assertEquals(result, expected);
    }
}