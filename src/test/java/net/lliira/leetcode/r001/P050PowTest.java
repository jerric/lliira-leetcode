package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P050PowTest {
    private final P050Pow solution = new P050Pow();

    @Test
    public void tests() {
        test(-13.62608, 3, -2529.9550389278597);
        test(2, -2147483648, 0);
        test(0.00001, 2147483647, 0);
        test(3, 3, 27);
        test(4, 2, 16);
    }

    private void test(final double input, final int n, final double expected) {
        final double result = this.solution.myPow(input, n);
        Assert.assertEquals(result, expected);
    }
}