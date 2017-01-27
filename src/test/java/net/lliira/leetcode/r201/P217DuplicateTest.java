package net.lliira.leetcode.r201;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P217DuplicateTest {
    private final P217Duplicate solution = new P217Duplicate();

    @Test
    public void tests() {
        test(new int[]{2,1,3,1,4,5}, true);
        test(new int[]{5, 4, 3, 2, 1}, false);
    }

    private void test(final int[] nums, final boolean expected) {
        final boolean result = this.solution.containsDuplicate(nums);
        Assert.assertEquals(result, expected);
    }
}