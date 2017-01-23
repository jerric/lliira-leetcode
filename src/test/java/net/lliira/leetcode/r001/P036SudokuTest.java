package net.lliira.leetcode.r001;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/22/2017.
 */
public class P036SudokuTest {
    private final P036Sudoku solution = new P036Sudoku();

    @Test
    public void tests() {
        test(toBoard(".87654321","2........","3........","4........","5........","6........","7........","8........","9........"), true);
    }

    private void test(final char[][] board, final boolean expected) {
        final boolean result = this.solution.isValidSudoku(board);
        Assert.assertEquals(result, expected);
    }

    private char[][] toBoard(final String... rows) {
        final char[][] board = new char[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            board[i] = rows[i].toCharArray();
        }
        return board;
    }
}
