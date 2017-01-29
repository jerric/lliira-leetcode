package net.lliira.leetcode.r351;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P371IntSumTest {
    private final P371IntSum solution = new P371IntSum();

    @Test
    public void tests() {
        test(1, 2, 3);
        test(17, 23, 40);
    }

    private void test(final int input, final int b, final int expected) {
        final int result = this.solution.getSum(input, b);
        Assert.assertEquals(result, expected);
    }
}