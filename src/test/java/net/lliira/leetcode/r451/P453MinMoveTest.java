package net.lliira.leetcode.r451;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P453MinMoveTest {
    private final P453MinMove solution = new P453MinMove();

    @Test
    public void tests() {
        test(new int[]{1,2,3}, 3);
    }

    private void test(final int[] input, final int expected) {
        final int result = this.solution.minMoves(input);
        Assert.assertEquals(result, expected);
    }
}