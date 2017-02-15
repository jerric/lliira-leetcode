package net.lliira.leetcode.r051;

import java.util.List;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P051NQueenTest {
    private final P051NQueen solution = new P051NQueen();

    @Test
    public void tests() {
        test(4, list(list(".Q..",  "...Q", "Q...", "..Q."), list("..Q.", "Q...", "...Q", ".Q..")));
    }

    private void test(final int input, final List<List<String>> expected) {
        final List<List<String>> result = this.solution.solveNQueens(input);
        Assert.assertEquals(result, expected);
    }
}