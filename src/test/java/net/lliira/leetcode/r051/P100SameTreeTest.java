package net.lliira.leetcode.r051;

import net.lliira.leetcode.TreeNode;
import static net.lliira.leetcode.TestHelper.*;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/24/2017.
 */
public class P100SameTreeTest {
    private final P100SameTree solution = new P100SameTree();

    @Test
    public void tests() {
        test(tree(1, tree(2), tree(3)), tree(1, tree(2), tree(3)), true);
        test(tree(1, tree(2, tree(3), null), null), tree(1, tree(2), tree(3)), false);
    }

    private void test(TreeNode left, TreeNode right, final boolean expected) {
        final boolean result = this.solution.isSameTree(left, right);
        Assert.assertEquals(result, expected);
    }
}
