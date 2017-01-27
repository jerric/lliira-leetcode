package net.lliira.leetcode.r201;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P219Duplicate2Test {
    private final P219Duplicate2 solution = new P219Duplicate2();

    @Test
    public void tests() {
        test(new int[]{1, 2, 3, 1, 5, 6}, 3, true);
        test(new int[]{1, 2, 3, 1, 5, 6}, 2, false);
    }

    private void test(final int[] nums, final int k, final boolean expected) {
        final boolean result = this.solution.containsNearbyDuplicate(nums, k);
        Assert.assertEquals(result, expected);
    }
}