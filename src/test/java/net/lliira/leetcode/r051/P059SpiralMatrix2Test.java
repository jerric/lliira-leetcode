package net.lliira.leetcode.r051;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P059SpiralMatrix2Test {
    private final P059SpiralMatrix2 solution = new P059SpiralMatrix2();

    @Test
    public void tests() {
        test(1, new int[][]{{1}});
        test(2, new int[][]{{1,2}, {4,3}});
        test(3, new int[][]{{1,2,3},{8,9,4},{7,6,5}});
    }

    private void test(final int input, final int[][] expected) {
        final int[][] result = this.solution.generateMatrix(input);
        Assert.assertEquals(result.length, expected.length);
        for (int y = 0; y < result.length; y++) {
            assertEquals(result[y], expected[y]);
        }
    }
}