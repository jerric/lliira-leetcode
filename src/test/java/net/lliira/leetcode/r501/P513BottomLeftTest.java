package net.lliira.leetcode.r501;

import net.lliira.leetcode.ListNode;
import net.lliira.leetcode.TreeNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P513BottomLeftTest {
    private final P513BottomLeft solution = new P513BottomLeft();

    @Test
    public void tests() {
        test(tree(1, tree(2), tree(3)), 2);
        test(tree(1, tree(2, tree(4), null), tree(3, tree(5, tree(7), null), tree(6))), 7);
    }

    private void test(final TreeNode input, final int expected) {
        final int result = this.solution.findBottomLeftValue(input);
        Assert.assertEquals(result, expected);
    }
}