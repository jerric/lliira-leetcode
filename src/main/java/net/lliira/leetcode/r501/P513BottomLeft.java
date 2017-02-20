package net.lliira.leetcode.r501;

import net.lliira.leetcode.TreeNode;

/**
 Given a binary tree, find the leftmost value in the last row of the tree.

 Example 1:
 Input:

   2
  / \
 1   3

 Output:
 1
 Example 2:
 Input:

       1
      / \
     2   3
    /   / \
   4   5   6
      /
     7

 Output:
 7
 Note: You may assume the tree (i.e., the given root node) is not NULL.
 */
public class P513BottomLeft {
    public int findBottomLeftValue(TreeNode root) {
        final int[] data = new int[]{-1, 0};
        dfs(root, 0, data);
        return data[1];
    }

    private void dfs(final TreeNode node, int h, int[] data) {
        if (node == null) return;
        if (data[0] < h) {
            data[0] = h;
            data[1] = node.val;
        }
        h++;
        dfs(node.left, h, data);
        dfs(node.right, h, data);
    }
}
