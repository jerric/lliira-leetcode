package net.lliira.leetcode.r251;

import net.lliira.leetcode.ListNode;
import net.lliira.leetcode.TreeNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P257BTreePathTest {
    private final P257BTreePath solution = new P257BTreePath();

    @Test
    public void tests() {
        test(tree(1, tree(2, null, tree(5)), tree(3)), list("1->2->5", "1->3"));
    }

    private void test(final TreeNode input, final List<String> expected) {
        final List<String> result = this.solution.binaryTreePaths(input);
        Assert.assertEquals(result, expected);
    }
}