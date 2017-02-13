package net.lliira.leetcode.r001;

import java.util.List;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P040CombSum2Test {
    private final P040CombSum2 solution = new P040CombSum2();

    @Test
    public void tests() {
        test(new int[]{10, 1, 2, 7, 6, 1, 5}, 8, list(list(1, 1, 6), list(1, 2, 5), list(1, 7), list(2, 6)));
    }

    private void test(final int[] input, final int target, final List<List<Integer>> expected) {
        final List<List<Integer>> result = this.solution.combinationSum2(input, target);
        Assert.assertEquals(result, expected);
    }
}