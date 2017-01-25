package net.lliira.leetcode.r101;



import net.lliira.leetcode.TreeNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/24/2017.
 */
public class P110BalancedTreeTest {
    private final P110BalancedTree s = new P110BalancedTree();

    @Test
    public void t() {
        t(tree(1, tree(2), tree(3, tree(4), null)), true);
    }

    private void t(final TreeNode root, final boolean e) {
        final boolean r = this.s.isBalanced(root);
        Assert.assertEquals(r, e);
    }
}
