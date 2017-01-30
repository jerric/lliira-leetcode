package net.lliira.leetcode.r351;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P400NthDigitTest {
    private final P400NthDigit solution = new P400NthDigit();

    @Test
    public void tests() {
        test(1000000000, 1);
        test(13, 1);
        test(3, 3);
        test(11, 0);
    }

    private void test(final int input, final int expected) {
        final int result = this.solution.findNthDigit(input);
        Assert.assertEquals(result, expected);
    }
}