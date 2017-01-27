package net.lliira.leetcode.r251;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P258AddDigitsTest {
    private final P258AddDigits solution = new P258AddDigits();

    @Test
    public void tests() {
        test(38, 2);
        test(22, 4);
    }

    private void test(final int input, final int expected) {
        final int result = this.solution.addDigits(input);
        Assert.assertEquals(result, expected);
    }
}