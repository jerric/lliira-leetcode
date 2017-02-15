package net.lliira.leetcode.r051;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P053MaxSubarrayTest {
    private final P053MaxSubarray solution = new P053MaxSubarray();

    @Test
    public void tests() {
        test(new int[]{-2,1}, 1);
        test(new int[]{-2,1,-3,4,-1,2,1,-5,4}, 6);
    }

    private void test(final int[] input, final int expected) {
        final int result = this.solution.maxSubArray(input);
        Assert.assertEquals(result, expected);
    }
}