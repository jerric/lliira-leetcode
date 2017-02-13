package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P037SudokuSolverTest {
    private final P037SudokuSolver solution = new P037SudokuSolver();

    @Test
    public void tests() {
        test(sudoku("..9748...","7........",".2.1.9...","..7...24.",".64.1.59.",".98...3..","...8.3.2.","........6","...2759.."),
                sudoku("519748632","783652419","426139875","357986241","264317598","198524367","975863124","832491756","641275983"));
    }

    private void test(final char[][] input, final char[][] expected) {
        this.solution.solveSudoku(input);
        Assert.assertEquals(input, expected);
    }
}