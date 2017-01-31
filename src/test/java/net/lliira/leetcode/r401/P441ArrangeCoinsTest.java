package net.lliira.leetcode.r401;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P441ArrangeCoinsTest {
    private final P441ArrangeCoins solution = new P441ArrangeCoins();

    @Test
    public void tests() {
        test(1804289383, 60070);
        test(3, 2);
        test(5, 2);
        test(8, 3);
    }

    private void test(final int a, final int expected) {
        final int result = this.solution.arrangeCoins(a);
        Assert.assertEquals(result, expected);
    }
}