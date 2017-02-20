package net.lliira.leetcode.r501;

import net.lliira.leetcode.ListNode;
import net.lliira.leetcode.TreeNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P508SubtreeSumTest {
    private final P508SubtreeSum solution = new P508SubtreeSum();

    @Test
    public void tests() {
        test(tree(5, tree(2), tree(-3)), new int[]{2, -3, 4});
        test(tree(5, tree(2), tree(-5)), new int[]{2});
    }

    private void test(final TreeNode input, final int[] expected) {
        final int[] result = this.solution.findFrequentTreeSum(input);
        Assert.assertEquals(result, expected);
    }
}