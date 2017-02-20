package net.lliira.leetcode.r501;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P505Maze2Test {
    private final P505Maze2 solution = new P505Maze2();

    @Test
    public void tests() {
        test(new int[][]{{0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0}}, new int[]{0, 4}, new int[]{4,4}, 12);
    }

    private void test(final int[][] input, final int[] start, final int[] dest, final int expected) {
        final int result = this.solution.shortestDistance(input, start, dest);
        Assert.assertEquals(result, expected);
    }
}