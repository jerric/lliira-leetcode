package net.lliira.leetcode.r501;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 There is a ball in a maze with empty spaces and walls. The ball can go through empty spaces by
 rolling up, down, left or right, but it won't stop rolling until hitting a wall. When the ball
 stops, it could choose the next direction.

 Given the ball's start position, the destination and the maze, find the shortest distance for the
 ball to stop at the destination. The distance is defined by the number of empty spaces traveled by
 the ball from the start position (excluded) to the destination (included). If the ball cannot stop
 at the destination, return -1.

 The maze is represented by a binary 2D array. 1 means the wall and 0 means the empty space. You
 may assume that the borders of the maze are all walls. The start and destination coordinates are
 represented by row and column indexes.

 Example 1

 Input 1: a maze represented by a 2D array

 0 0 1 0 0
 0 0 0 0 0
 0 0 0 1 0
 1 1 0 1 1
 0 0 0 0 0

 Input 2: start coordinate (rowStart, colStart) = (0, 4)
 Input 3: destination coordinate (rowDest, colDest) = (4, 4)

 Output: 12
 Explanation: One shortest way is : left -> down -> left -> down -> right -> down -> right.
 The total distance is 1 + 1 + 3 + 1 + 2 + 2 + 2 = 12.

 Example 2

 Input 1: a maze represented by a 2D array

 0 0 1 0 0
 0 0 0 0 0
 0 0 0 1 0
 1 1 0 1 1
 0 0 0 0 0

 Input 2: start coordinate (rowStart, colStart) = (0, 4)
 Input 3: destination coordinate (rowDest, colDest) = (3, 2)

 Output: -1
 Explanation: There is no way for the ball to stop at the destination.

 Note:
 There is only one ball and one destination in the maze.
 Both the ball and the destination exist on an empty space, and they will not be at the same
 position initially.
 The given maze does not contain border (like the red rectangle in the example pictures), but you
 could assume the border of the maze are all walls.
 The maze contains at least 2 empty spaces, and both the width and height of the maze won't exceed
 100.
 */
public class P505Maze2 {
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        final int sx = start[1], sy = start[0], dx = destination[1], dy = destination[0];
        final int height = maze.length, width = maze[0].length;
        final Queue<int[]> queue = new PriorityQueue<>();
        final boolean[][] checked = new boolean[height][width];
        final int[][] distances = new int[height][width];
        checked[start[0]][start[1]] = true;
        queue.offer(start);
        while (!queue.isEmpty()) {
            final int[] cell = queue.poll();
            final int x = cell[1], y = cell[0];
            checked[y][x] = true;
            final int d = distances[y][x];

            int mx = x;
            while (mx > 0 && maze[y][mx - 1] == 0) mx--;
            if (mx != x) check(checked, distances, queue, mx, y, d + (x - mx), sx, sy);

            mx = x;
            while (mx < width - 1 && maze[y][mx + 1] == 0) mx++;
            if (mx != x) check(checked, distances, queue, mx, y, d + (mx - x), sx, sy);

            int my = y;
            while (my > 0 && maze[my - 1][x] == 0) my--;
            if (my != y) check(checked, distances, queue, x, my, d + (y - my), sx, sy);

            my = y;
            while (my < height - 1 && maze[my + 1][x] == 0) my++;
            if (my != y) check(checked, distances, queue, x, my, d + (my - y), sx, sy);
        }
        final int d = distances[dy][dx];
        return (d == 0) ? -1 : d;
    }

    private void check(final boolean[][] checked, final int[][] distances, final Queue<int[]> queue,
            final int x, final int y, final int distance, final int sx, final int sy) {
        final int d = distances[y][x];
        if ((d == 0 && (x != sx || y != sy)) || d > distance) distances[y][x] = distance;
        if (!checked[y][x]) queue.offer(new int[]{y, x});
    }

}
