package net.lliira.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/14/2017.
 */
public class P011ContainerTest {

    private P011Container solution = new P011Container();

    @Test
    public void testCase() {
        test(new int[]{3, 4}, 6);
        test(new int[]{3, 4, 5}, 9);

    }

    private void test(final int[] heights, final int expected) {
        final int result = this.solution.maxArea(heights);
        Assert.assertEquals(result, expected);
    }
}
