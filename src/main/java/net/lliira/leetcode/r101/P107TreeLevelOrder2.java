package net.lliira.leetcode.r101;

import net.lliira.leetcode.TreeNode;

import java.util.*;

/**
 * Created by Jerric on 1/24/2017.
 */
public class P107TreeLevelOrder2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        final Deque<TreeNode> deque = new ArrayDeque<>();
        final LinkedList<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;
        deque.offer(root);
        int count = 1;
        while (!deque.isEmpty()) {
            int ncount = 0;
            final List<Integer> list = new ArrayList<>(count);
            for (int i = 0; i < count; i++) {
                final TreeNode node = deque.poll();
                list.add(node.val);
                if (node.left != null) {
                    deque.offer(node.left);
                    ncount++;
                }
                if (node.right != null) {
                    deque.offer(node.right);
                    ncount++;
                }
            }
            result.offerFirst(list);
            count = ncount;
        }
        return result;
    }
}
