package net.lliira.leetcode.r501;

import net.lliira.leetcode.ListNode;
import net.lliira.leetcode.TreeNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P501ModeTest {
    private final P501Mode solution = new P501Mode();

    @Test
    public void tests() {
        test(tree(1,null,2,2), new int[] {2});
    }

    private void test(final TreeNode input, final int[] expected) {
        final int[] result = this.solution.findMode(input);
        assertEquals(result, expected);
    }
}