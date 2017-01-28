package net.lliira.leetcode.r301;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P342Power4Test {
    private final P342Power4 solution = new P342Power4();

    @Test
    public void tests() {
        test(16, true);
        test(12, false);
    }

    private void test(final int input, final boolean expected) {
        final boolean result = this.solution.isPowerOfFour(input);
        Assert.assertEquals(result, expected);
    }
}