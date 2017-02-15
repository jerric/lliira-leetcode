package net.lliira.leetcode.r051;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P054SpiralMatrixTest {
    private final P054SpiralMatrix solution = new P054SpiralMatrix();

    @Test
    public void tests() {
        test(new int[][]{{1, 2}, {3, 4}}, list(1, 2, 4, 3));
        test(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, list(1, 2, 3, 6, 9, 8, 7, 4, 5));
    }

    private void test(final int[][] input, final List<Integer> expected) {
        final List<Integer> result = this.solution.spiralOrder(input);
        Assert.assertEquals(result, expected);
    }
}