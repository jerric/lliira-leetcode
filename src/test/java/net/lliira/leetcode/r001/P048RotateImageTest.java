package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P048RotateImageTest {
    private final P048RotateImage solution = new P048RotateImage();

    @Test
    public void tests() {
        test(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[][]{{7,4,1}, {8,5,2}, {9,6,3}});
        test(new int[][]{{1, 2}, {3, 4}}, new int[][]{{3, 1}, {4, 2}});
    }

    private void test(final int[][] input, final int[][] expected) {
        this.solution.rotate2(input);
        for (int x = 0; x < input.length; x++) {
            for (int y = 0; y < input[x].length; y++) {
                Assert.assertEquals(input[x][y], expected[x][y]);
            }
        }
    }
}