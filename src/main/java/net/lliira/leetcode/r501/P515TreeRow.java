package net.lliira.leetcode.r501;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import net.lliira.leetcode.TreeNode;

/**
 You need to find the largest value in each row of a binary tree.

 Example:
 Input:

     1
    / \
   3   2
  / \   \
 5   3   9

 Output: [1, 3, 9]
 */
public class P515TreeRow {
    public List<Integer> largestValues(TreeNode root) {
        final List<Integer> result = new LinkedList<>();
        if (root == null) return result;
        final Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int max = Integer.MIN_VALUE;
            for (int i = queue.size(); i > 0; i--) {
                final TreeNode node = queue.poll();
                if (max < node.val) max = node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(max);
        }
        return result;
    }
}
