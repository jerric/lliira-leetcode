package net.lliira.leetcode.r001;

import java.util.List;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P047Permutation2Test {
    private final P047Permutation2 solution = new P047Permutation2();

    @Test
    public void tests() {
        test(new int[]{1,1,2}, list(list(1, 1, 2), list(1, 2, 1), list(2, 1, 1)));
        test(new int[]{1,1,1}, list(list(1, 1, 1)));
    }

    private void test(final int[] input, final List<List<Integer>> expected) {
        final List<List<Integer>> result = this.solution.permuteUnique(input);
        Assert.assertEquals(result, expected);
    }
}