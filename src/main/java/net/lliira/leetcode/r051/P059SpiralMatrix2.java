package net.lliira.leetcode.r051;

/**
 Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

 For example,
 Given n = 3,

 You should return the following matrix:
 [
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
 ]
 */
public class P059SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        if (n <= 0) return new int[0][0];
        if (n == 1) return new int[][]{{1}};
        final int[][] matrix = new int[n][n];
        int top = 0, left = 0, bottom = n - 1, right = bottom, i = 1, total = n * n;
        while (top <= bottom && left <= right) {
            // walk along top row
            for (int x = left; x <= right; x++) matrix[top][x] = i++;
            if (++top > bottom) break;

            // walk along right column
            for (int y = top; y <= bottom; y++) matrix[y][right] = i++;
            right--;

            // walk along bottom row
            for (int x = right; x >= left; x--) matrix[bottom][x] = i++;
            if (top > --bottom) break;

            // walk along left column
            for (int y = bottom; y >= top; y--) matrix[y][left] = i++;
            left++;
        }
        return matrix;
    }
}
