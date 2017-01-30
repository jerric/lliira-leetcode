package net.lliira.leetcode.r401;

import net.lliira.leetcode.TreeNode;

/**
 * Created by Jerric on 1/29/2017.
 */
public class P404SumLeft {
    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root, false);
    }

    private int sum(TreeNode node, boolean isLeft) {
        if (node == null) return 0;
        if (node.left == null && node.right == null && isLeft) return node.val;
        return sum(node.left, true) + sum(node.right, false);
    }
}
