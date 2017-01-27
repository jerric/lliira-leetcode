package net.lliira.leetcode.r201;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P231Power2Test {
    private final P231Power2 solution = new P231Power2();

    @Test
    public void tests() {
        test(6, false);
        test(16, true);
    }

    private void test(final int a, final boolean expected) {
        final boolean result = this.solution.isPowerOfTwo(a);
        Assert.assertEquals(result, expected);
    }
}