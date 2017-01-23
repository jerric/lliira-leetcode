package net.lliira.leetcode.r051;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/23/2017.
 */
public class P070ClimbStairsTest {
    private final P070ClimbStairs solution = new P070ClimbStairs();

    @Test
    public void tests() {
        test(1, 1);
        test(2, 2);
        test(3, 3);
        test(4, 5);
    }
    private void test(final int n, final int expected) {
        final int result = this.solution.climbStairs(n);
        Assert.assertEquals(result, expected);
    }
}
