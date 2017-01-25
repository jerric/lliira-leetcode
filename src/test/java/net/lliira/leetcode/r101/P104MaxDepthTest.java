package net.lliira.leetcode.r101;

import net.lliira.leetcode.TreeNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/24/2017.
 */
public class P104MaxDepthTest {
    private final P104MaxDepth s = new P104MaxDepth();

    @Test
    public void t() {
        t(tree(1, null, tree(2, tree(3, tree(5), null), tree(4))), 3);
    }
    private void t(final TreeNode root, final int e) {
        final int r = this.s.maxDepth(root);
        Assert.assertEquals(r, e);
    }
}
