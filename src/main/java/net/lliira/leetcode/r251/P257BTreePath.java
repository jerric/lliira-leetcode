package net.lliira.leetcode.r251;

import net.lliira.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Jerric on 1/27/2017.
 */
public class P257BTreePath {
    public List<String> binaryTreePaths(TreeNode root) {
        final List<String> paths = new LinkedList<>();
        if (root == null) return paths;
        traverse(root, "", paths);
        return paths;
    }

    private void traverse(final TreeNode node, String path, final List<String> paths) {
        path += node.val;
        if (node.left == null && node.right == null)  paths.add(path);
        else {
            path += "->";
            if (node.left != null) traverse(node.left, path, paths);
            if (node.right != null) traverse(node.right, path, paths);
        }
    }
}
