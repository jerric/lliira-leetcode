package net.lliira.leetcode.r451;

/**
 * Created by Jerric on 1/31/2017.
 */
public class P463IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int count = 0;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                if (grid[y][x] == 1) {
                    if (x == 0 || grid[y][x - 1] == 0) count++;
                    if (y == 0 || grid[y - 1][x] == 0) count++;
                    if (x == grid[y].length - 1 || grid[y][x + 1] == 0) count++;
                    if (y == grid.length - 1 || grid[y + 1][x] == 0) count++;
                }
            }
        }
        return count;
    }
}
