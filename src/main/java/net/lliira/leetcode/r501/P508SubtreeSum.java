package net.lliira.leetcode.r501;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.lliira.leetcode.TreeNode;

/**
 Given the root of a tree, you are asked to find the most frequent subtree sum. The subtree sum of a node is defined as the sum of all the node values formed by the subtree rooted at that node (including the node itself). So what is the most frequent subtree sum value? If there is a tie, return all the values with the highest frequency in any order.

 Examples 1
 Input:

  5
 /  \
 2   -3
 return [2, -3, 4], since all the values happen only once, return all of them in any order.
 Examples 2
 Input:

  5
 /  \
 2   -5
 return [2], since 2 happens twice, however -5 only occur once.
 Note: You may assume the sum of values in any subtree is in the range of 32-bit signed integer.
 */
public class P508SubtreeSum {
    public int[] findFrequentTreeSum(TreeNode root) {
        final Map<Integer, Integer> counts = new HashMap<>();
        sum(root, counts);

        int max = 0;
        for (int count : counts.values()) {
            if (count > max) max = count;
        }
        final List<Integer> sums = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == max) sums.add(entry.getKey());
        }
        final int[] result = new int[sums.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = sums.get(i);
        }
        return result;
    }

    private int sum(final TreeNode node, final Map<Integer, Integer> counts) {
        if (node == null) return 0;
        final int left = sum(node.left, counts);
        final int right = sum(node.right, counts);
        final int sum = left + right + node.val;
        counts.put(sum, counts.getOrDefault(sum, 0) + 1);
        return sum;
    }
}
