package net.lliira.leetcode.r001;

/**
 You are given an n x n 2D matrix representing an image.

 Rotate the image by 90 degrees (clockwise).

 Follow up:
 Could you do this in-place?
 */
public class P048RotateImage {
    public void rotate(int[][] matrix) {
        final int len = matrix.length - 1, half = len / 2 + 1, center = (len + 1) / 2;
        for (int x = 0; x < half; x++) {
            for (int y = 0; y < center; y++) {
                final int tmp = matrix[y][x];

                final int x1 = y;
                final int y1 = len - x;
                matrix[y][x] = matrix[y1][x1];

                final int x2 = len - x;
                final int y2 = len - y;
                matrix[y1][x1] = matrix[y2][x2];

                final int x3 = len - y;
                final int y3 = x;
                matrix[y2][x2] = matrix[y3][x3];

                matrix[y3][x3] = tmp;
            }
        }
    }

    public void rotate2(int[][] matrix) {
        final int len = matrix.length, half = len / 2, lenl = len - 1;
        for (int y = 0; y < half; y++) {
            final int[] tmp = matrix[y];
            final int y1 = lenl - y;
            matrix[y] = matrix[y1];
            matrix[y1] = tmp;
        }
        for (int y = 0; y < len; y++) {
            for (int x = y + 1; x < len; x++) {
                final int tmp = matrix[y][x];
                matrix[y][x] = matrix[x][y];
                matrix[x][y] = tmp;
            }
        }
    }
}
