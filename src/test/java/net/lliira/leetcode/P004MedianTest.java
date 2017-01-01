package net.lliira.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 12/29/2016.
 */
public class P004MedianTest {

    private final P004Median solution = new P004Median();

    @Test
    public void testCase1() {
        test(new int[]{1, 3}, new int[]{2}, 2D);
        test(new int[]{1, 2}, new int[]{3, 4}, 2.5D);
    }

    private void test(final int[] l1, final int[] l2, final double expected) {
        final double median = solution.findMedianSortedArrays(l1, l2);
        Assert.assertEquals(median, expected);
    }
}
