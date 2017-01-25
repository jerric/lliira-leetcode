package net.lliira.leetcode.r101;

import net.lliira.leetcode.TreeNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/24/2017.
 */
public class P111MinDepthTest {
    private final P111MinDepth s = new P111MinDepth();

    @Test
    public void t() {
        t(tree(1, null, tree(2, tree(3, tree(5), null), tree(4))), 3);
    }
    private void t(final TreeNode root, final int e) {
        final int r = this.s.minDepth(root);
        Assert.assertEquals(r, e);
    }
}
