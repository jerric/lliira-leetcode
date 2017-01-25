package net.lliira.leetcode.r101;

import net.lliira.leetcode.TreeNode;

/**
 * Created by Jerric on 1/24/2017.
 */
public class P101SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(final TreeNode left, final TreeNode right) {
        if (left == null && right == null) return true;
        if ((left == null && right != null) || (left != null && right == null) || (left.val != right.val)) return false;
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
