package net.lliira.leetcode.r001;

/**
 * Created by Jerric on 1/22/2017.
 */
public class P036Sudoku {
    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length != 9) return false;
        for (int r = 0; r < board.length; r++) {
            if (board[r].length != 9) return false;
        }
        final boolean[][] rows = new boolean[9][9];
        final boolean[][] columns = new boolean[9][9];
        final boolean[][] blocks = new boolean[9][9];
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                final char ch = board[r][c];
                if ((ch < '1' || ch > '9') && ch != '.') return false;
                if (ch == '.') continue;
                final int v = ch - '1';
                if (!checkAndSet(rows, r, v)) return false;
                if (!checkAndSet(columns, c, v)) return false;
                if (!checkAndSet(blocks, (c / 3 + r / 3 * 3), v)) return false;
            }
        }
        return true;
    }

    private boolean checkAndSet(final boolean[][] map, final int idx, final int v) {
        if (map[idx][v]) return false;
        map[idx][v] = true;
        return true;
    }
}
