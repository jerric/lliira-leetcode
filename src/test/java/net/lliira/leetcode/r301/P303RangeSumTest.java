package net.lliira.leetcode.r301;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P303RangeSumTest {
    private final P303RangeSum solution = new P303RangeSum();

    @Test
    public void tests() {
        final int[] nums = {-2, 0, 3, -5, 2, -1};
        test(nums, 0, 2, 1);
        test(nums, 2, 5, -1);
        test(nums, 0, 5, -3);
    }

    private void test(final int[] input, final int i, final int j, final int expected) {
        final int result = this.solution.create(input).sumRange(i, j);
        Assert.assertEquals(result, expected);
    }
}