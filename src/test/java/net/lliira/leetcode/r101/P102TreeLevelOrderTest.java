package net.lliira.leetcode.r101;

import net.lliira.leetcode.TreeNode;
import org.testng.annotations.Test;

import java.util.List;

import static net.lliira.leetcode.TestHelper.*;


/**
 * Created by Jerric on 1/24/2017.
 */
public class P102TreeLevelOrderTest {
    private final P102TreeLevelOrder s = new P102TreeLevelOrder();

    @Test
    public void t() {
        t(tree(3, tree(9), tree(20, tree(15), tree(7))), list(list(3), list(9, 20), list(15, 7)));
    }

    private void t(final TreeNode tree, final List<List<Integer>> e) {
        final List<List<Integer>> r = this.s.levelOrder(tree);
        assertEquals(r, e);
    }
}
