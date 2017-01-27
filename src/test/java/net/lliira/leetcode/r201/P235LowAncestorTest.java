package net.lliira.leetcode.r201;

import net.lliira.leetcode.ListNode;
import net.lliira.leetcode.TreeNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P235LowAncestorTest {
    private final P235LowAncestor solution = new P235LowAncestor();

    @Test
    public void tests() {
        final TreeNode node4 = tree(4, tree(3), tree(5));
        final TreeNode node8 = tree(8, tree(7), tree(9));
        final TreeNode node2 = tree(2, tree(0), node4);
        final TreeNode root = tree(6, node2, node8);
        test(root, node4, node8, root);
        test(root, node2, node4, node2);
    }

    private void test(final TreeNode root, final TreeNode p, final TreeNode q, final TreeNode expected) {
        final TreeNode result = this.solution.lowestCommonAncestor(root, p, q);
        Assert.assertEquals(result, expected);
    }
}