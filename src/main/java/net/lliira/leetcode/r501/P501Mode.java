package net.lliira.leetcode.r501;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.lliira.leetcode.TreeNode;

/**
 * Created by jerricg on 1/31/17.
 */
public class P501Mode {
    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];
        final Map<Integer, Integer> counts = new HashMap<>(100);
        int max = count(root, counts, 0);
        final List<Integer> list = new ArrayList<>(counts.size());
        for (final Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == max) list.add(entry.getKey());
        }

        int idx = 0;
        final int[] result = new int[list.size()];
        for (int val : list) result[idx++] = val;
        return result;
    }

    private int count(final TreeNode node, final Map<Integer, Integer> counts, int max) {
        if (node == null) return max;
        int count = counts.getOrDefault(node.val, 0) + 1;
        counts.put(node.val, count);
        max = Math.max(max, count);
        max = Math.max(max, count(node.left, counts, max));
        return Math.max(max, count(node.right, counts, max));
    }
}
