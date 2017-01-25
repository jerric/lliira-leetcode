package net.lliira.leetcode.r101;

import net.lliira.leetcode.TreeNode;

/**
 * Created by Jerric on 1/24/2017.
 */
public class P112PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return root.val == sum;
        final int remain = sum - root.val;
        return hasPathSum(root.left, remain) || hasPathSum(root.right, remain);
    }
}
