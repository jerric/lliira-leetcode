package net.lliira.leetcode.r001;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

 The Sudoku board could be partially filled, where empty cells are filled with the character '.'.


 A partially filled sudoku which is valid.

 Note:
 A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
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
