package net.lliira.leetcode.r101;

import net.lliira.leetcode.TreeNode;

/**
 * Created by Jerric on 1/24/2017.
 */
public class P111MinDepth {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) return minDepth(root.right) + 1;
        if (root.right == null) return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
