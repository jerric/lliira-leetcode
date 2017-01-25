package net.lliira.leetcode.r101;

import net.lliira.leetcode.TreeNode;
import org.testng.annotations.Test;

import java.util.List;

import static net.lliira.leetcode.TestHelper.*;


/**
 * Created by Jerric on 1/24/2017.
 */
public class P107TreeLevelOrder2Test {
    private final P107TreeLevelOrder2 s = new P107TreeLevelOrder2();

    @Test
    public void t() {
        t(tree(3, tree(9), tree(20, tree(15), tree(7))), list(list(15, 7), list(9, 20), list(3)));
    }

    private void t(final TreeNode tree, final List<List<Integer>> e) {
        final List<List<Integer>> r = this.s.levelOrder(tree);
        assertEquals(r, e);
    }
}
