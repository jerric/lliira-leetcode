package net.lliira.leetcode.r401;

import net.lliira.leetcode.ListNode;
import net.lliira.leetcode.TreeNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P437PathSum3Test {
    private final P437PathSum3 solution = new P437PathSum3();

    @Test
    public void tests() {
        test(tree(10,5,-3,3,2,null,11,3,-2,null,1), 8, 3);
    }

    private void test(final TreeNode input, final int sum, final int expected) {
        final int result = this.solution.pathSum(input, sum);
        Assert.assertEquals(result, expected);
    }
}