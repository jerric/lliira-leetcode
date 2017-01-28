package net.lliira.leetcode.r251;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P292NimGameTest {
    private final P292NimGame solution = new P292NimGame();

    @Test
    public void tests() {
        test(1199886170, true);
        test(4, false);
        test(5, true);
    }

    private void test(final int input, final boolean expected) {
        final boolean result = this.solution.canWinNim(input);
        Assert.assertEquals(result, expected);
    }
}