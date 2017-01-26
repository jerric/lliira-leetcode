package net.lliira.leetcode.r151;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P198HouseRobberTest {
    private final P198HouseRobber solution = new P198HouseRobber();

    @Test
    public void tests() {
        test(new int[]{1, 2, 3, 4, 5},9 );
    }

    private void test(final int[] a, final int expected) {
        final int result = this.solution.rob(a);
        Assert.assertEquals(result, expected);
    }
}