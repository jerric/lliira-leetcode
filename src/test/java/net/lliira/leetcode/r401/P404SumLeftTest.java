package net.lliira.leetcode.r401;

import net.lliira.leetcode.ListNode;
import net.lliira.leetcode.TreeNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P404SumLeftTest {
    private final P404SumLeft solution = new P404SumLeft();

    @Test
    public void tests() {
        test(tree(3, tree(9), tree(20, tree(15), tree(7))), 24);
    }

    private void test(final TreeNode input, final int expected) {
        final int result = this.solution.sumOfLeftLeaves(input);
        Assert.assertEquals(result, expected);
    }
}