package net.lliira.leetcode.r101;

import net.lliira.leetcode.TreeNode;

/**
 * Created by Jerric on 1/24/2017.
 */
public class P104MaxDepth {
    public int maxDepth(TreeNode root) {
        return  (root == null) ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
