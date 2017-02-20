package net.lliira.leetcode.r501;

import java.util.List;

import net.lliira.leetcode.Interval;
import net.lliira.leetcode.ListNode;
import net.lliira.leetcode.TreeNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P515TreeRowTest {
    private final P515TreeRow solution = new P515TreeRow();

    @Test
    public void tests() {
        test(tree(1, tree(3, tree(5), tree(3)), tree(2, null, tree(9))), list(1, 3, 9));
    }

    private void test(final TreeNode input, final List<Integer> expected) {
        final List<Integer> result = this.solution.largestValues(input);
        Assert.assertEquals(result, expected);
    }
}