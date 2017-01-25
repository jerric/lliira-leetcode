package net.lliira.leetcode.r101;

import net.lliira.leetcode.TreeNode;
import static net.lliira.leetcode.TestHelper.*;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/24/2017.
 */
public class P101SymmetricTreeTest {
    private final P101SymmetricTree solution = new P101SymmetricTree();

    @Test
    public void tests() {
        test(tree(1, tree(2, tree(3), tree(4)), tree(2, tree(4), tree(3))), true);
        test(tree(1, tree(2, tree(3), tree(3)), tree(2, tree(4), tree(4))), false);
    }

    private void test(final TreeNode tree, final boolean e) {
        final boolean r = this.solution.isSymmetric(tree);
        Assert.assertEquals(r, e);
    }
}
