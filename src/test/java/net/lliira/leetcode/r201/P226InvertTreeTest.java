package net.lliira.leetcode.r201;

import net.lliira.leetcode.ListNode;
import net.lliira.leetcode.TreeNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P226InvertTreeTest {
    private final P226InvertTree solution = new P226InvertTree();

    @Test
    public void tests() {
        test(tree(4, tree(2, tree(1), tree(3)), tree(7, tree(6), tree(9))),
                tree(4, tree(7, tree(9), tree(6)), tree(2, tree(3), tree(1))));
    }

    private void test(final TreeNode root, final TreeNode expected) {
        final TreeNode result = this.solution.invertTree(root);
       assertEquals(result, expected);
    }
}