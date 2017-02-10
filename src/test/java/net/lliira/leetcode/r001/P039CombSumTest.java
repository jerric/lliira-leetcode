package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P039CombSumTest {
    private final P039CombSum solution = new P039CombSum();

    @Test
    public void tests() {
        test(new int[]{2, 3, 6, 7}, 7, list(list(2, 2, 3), list(7)));
    }

    private void test(final int[] input, final int target, final List<List<Integer>> expected) {
        final List<List<Integer>> result = this.solution.combinationSum(input, target);
        Assert.assertEquals(result, expected);
    }
}