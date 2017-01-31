package net.lliira.leetcode.r451;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P463IslandPerimeterTest {
    private final P463IslandPerimeter solution = new P463IslandPerimeter();

    @Test
    public void tests() {
        test(new int[][]{{0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0}}, 16);
    }

    private void test(final int[][] input, final int expected) {
        final int result = this.solution.islandPerimeter(input);
        Assert.assertEquals(result, expected);
    }
}