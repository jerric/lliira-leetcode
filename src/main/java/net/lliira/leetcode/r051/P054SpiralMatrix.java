package net.lliira.leetcode.r051;

import java.util.LinkedList;
import java.util.List;

/**
 Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

 For example,
 Given the following matrix:

 [
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
 ]
 You should return [1,2,3,6,9,8,7,4,5].
 */
public class P054SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        final List<Integer> result = new LinkedList<>();
        if (matrix.length == 0 || matrix[0].length == 0) return result;
        int rowLow = 0, rowHigh = matrix.length - 1, colLow = 0, colHigh = matrix[0].length - 1;
        int x = 0, y = 0, direction = 0;
        while (rowLow <= rowHigh && colLow <= colHigh) {
            result.add(matrix[y][x]);
            if (direction == 0) {
                if (x == colHigh) {
                    rowLow++;
                    direction++;
                    y++;
                } else x++;
            } else if (direction == 1) {
                if (y == rowHigh) {
                    colHigh--;
                    direction++;
                    x--;
                } else y++;
            } else if (direction == 2) {
                if (x == colLow) {
                    rowHigh--;
                    direction++;
                    y--;
                } else x--;
            } else {
                if (y == rowLow) {
                    colLow++;
                    direction = 0;
                    x++;
                } else y--;
            }
        }
        return result;
    }
}
