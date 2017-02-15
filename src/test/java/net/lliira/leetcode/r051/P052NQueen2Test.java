package net.lliira.leetcode.r051;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P052NQueen2Test {
    private final P052NQueen2 solution = new P052NQueen2();

    @Test
    public void tests() {
        test(4, 1);
        test(8, 8);
    }

    private void test(final int input, final int expected) {
        final int result = this.solution.totalNQueens(input);
        Assert.assertEquals(result, expected);
    }
}