package net.lliira.leetcode.r501;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P506RelativeRankTest {
    private final P506RelativeRank solution = new P506RelativeRank();

    @Test
    public void tests() {
        test(new int[]{5, 4, 3, 2, 1}, new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"});
    }

    private void test(final int[] input, final String[] expected) {
        final String[] result = this.solution.findRelativeRanks(input);
        Assert.assertEquals(result, expected);
    }
}