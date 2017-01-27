package net.lliira.leetcode.r201;

import net.lliira.leetcode.TreeNode;

/**
 * Created by Jerric on 1/26/2017.
 */
public class P226InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        final TreeNode node = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = node;
        return root;
    }
}
