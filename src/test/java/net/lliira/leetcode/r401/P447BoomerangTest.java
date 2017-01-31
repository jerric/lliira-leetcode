package net.lliira.leetcode.r401;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P447BoomerangTest {
    private final P447Boomerang solution = new P447Boomerang();

    @Test
    public void tests() {
        test(new int[][]{{0,0},{1,0},{2,0}}, 2);
    }

    private void test(final int[][] input, final int expected) {
        final int result = this.solution.numberOfBoomerangs(input);
        Assert.assertEquals(result, expected);
    }
}