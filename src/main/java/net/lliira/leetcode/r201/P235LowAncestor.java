package net.lliira.leetcode.r201;

import net.lliira.leetcode.TreeNode;

import java.util.Stack;

/**
 * Created by Jerric on 1/26/2017.
 */
public class P235LowAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val == q.val) return p;
        if (p.val > q.val) {
            TreeNode n = q;
            q = p;
            p = n;
        }
        TreeNode node = root;
        while (node != null) {
            if (node.val == p.val || node.val == q.val) return node;
            if (node.val < p.val) node = node.right;
            else if (node.val > q.val) node = node.left;
            else break;
        }
        return node;
    }
}
