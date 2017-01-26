package net.lliira.leetcode.r201;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P202HappyNumberTest {
    private final P202HappyNumber solution = new P202HappyNumber();

    @Test
    public void tests() {
        test(3, false);
        test(19, true);
    }

    private void test(final int a, final boolean expected) {
        final boolean result = this.solution.isHappy(a);
        Assert.assertEquals(result, expected);
    }
}