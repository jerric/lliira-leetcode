package net.lliira.leetcode.r101;

import net.lliira.leetcode.TreeNode;

/**
 * Created by Jerric on 1/24/2017.
 */
public class P110BalancedTree {
    public boolean isBalanced(TreeNode root) {
        final Stub result = new Stub();
        height(root, result);
        return result.balanced;
    }

    private int height(final TreeNode node, final Stub result) {
        if (node == null) return 0;
        final int left = height(node.left, result);
        if (!result.balanced) return 0;
        final int right = height(node.right, result);
        if (!result.balanced) return 0;

        if (Math.abs(left - right) > 1) {
            result.balanced = false;
            return 0;
        }
        return Math.max(left, right) + 1;
    }

    private static class Stub {
        boolean balanced = true;
    }
}
