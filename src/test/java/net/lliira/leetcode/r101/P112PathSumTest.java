package net.lliira.leetcode.r101;

import net.lliira.leetcode.TreeNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.tree;

/**
 * Created by Jerric on 1/24/2017.
 */
public class P112PathSumTest {
    private final P112PathSum s = new P112PathSum();

    @Test
    public void t() {
        t(tree(5, tree(4, tree(11, tree(7), tree(2)), null),
                tree(8, tree(13), tree(4, null, tree(1)))), 22, true);
    }
    private void t(final TreeNode root, final int sum, final boolean e) {
        final boolean r = this.s.hasPathSum(root, sum);
        Assert.assertEquals(r, e);
    }
}
