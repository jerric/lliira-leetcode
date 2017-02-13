package net.lliira.leetcode.r001;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 */
public class P036SudokuTest {
    private final P036Sudoku solution = new P036Sudoku();

    @Test
    public void tests() {
        test(sudoku(".87654321","2........","3........","4........","5........","6........","7........","8........","9........"), true);
    }

    private void test(final char[][] board, final boolean expected) {
        final boolean result = this.solution.isValidSudoku(board);
        Assert.assertEquals(result, expected);
    }
}
