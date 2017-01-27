package net.lliira.leetcode.r251;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P263UglyNumberTest {
    private final P263UglyNumber solution = new P263UglyNumber();

    @Test
    public void tests() {
        test(6, true);
        test(14, false);
    }

    private void test(final int input, final boolean expected) {
        final boolean result = this.solution.isUgly(input);
        Assert.assertEquals(result, expected);
    }
}