package net.lliira.leetcode.r351;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P367ValidSquareTest {
    private final P367ValidSquare solution = new P367ValidSquare();

    @Test
    public void tests() {
        test(808201, true);
        test(4, true);
        test(8, false);
    }

    private void test(final int input, final boolean expected) {
        final boolean result = this.solution.isPerfectSquare(input);
        Assert.assertEquals(result, expected);
    }
}