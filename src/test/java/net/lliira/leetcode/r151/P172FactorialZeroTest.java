package net.lliira.leetcode.r151;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P172FactorialZeroTest {
    private final P172FactorialZero solution = new P172FactorialZero();

    @Test
    public void tests() {
        test(1, 0);
        test(4, 0);
        test(5, 1);
        test(10, 2);
        test(15, 3);
    }

    private void test(final int a, final int expected) {
        final int result = this.solution.trailingZeroes(a);
        Assert.assertEquals(result, expected);
    }
}