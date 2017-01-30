package net.lliira.leetcode.r401;

import net.lliira.leetcode.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Jerric on 1/30/2017.
 */
public class P437PathSum3 {
    public int pathSum(TreeNode root, int sum) {
        return sum(root, sum, new int[1000], 0);
    }

    private int sum(final TreeNode node, final int sum, final int[] sums, int size) {
        if (node == null) return 0;
        size++;
        int count = 0;
        for (int i = 0; i < size; i++) {
            sums[i] += node.val;
            if (sums[i] == sum) count++;
        }
        count += sum(node.left, sum, sums, size) + sum(node.right, sum, sums, size);
        for (int i = 0; i < size; i++) sums[i] -= node.val;
        return count;
    }
}
