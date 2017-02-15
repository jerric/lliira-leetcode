package net.lliira.leetcode.r051;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P055JumpGameTest {
    private final P055JumpGame solution = new P055JumpGame();

    @Test
    public void tests() {
        test(new int[]{2,3,1,1,4}, true);
        test(new int[]{3,2,1,0,4}, false);
    }

    private void test(final int[] input, final boolean expected) {
        final boolean result = this.solution.canJump(input);
        Assert.assertEquals(result, expected);
    }
}