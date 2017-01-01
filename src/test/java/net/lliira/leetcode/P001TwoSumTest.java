package net.lliira.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 12/26/2016.
 */
public class P001TwoSumTest {

    private final P001TwoSum solution = new P001TwoSum();
    @Test
    public void test1() {
        test(new int[]{0, 4, 3, 0}, 0, new int[]{0, 3});
        test(new int[]{150,24,79,50,88,345,3}, 200, new int[]{0, 3});
        test(new int[]{7, 2, 11, 15}, 13, new int[]{1, 2});
        test(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1});
        test(new int[]{2, 7, 11, 15}, 13, new int[]{0, 2});
    }

    private void test(final int[] nums, final int target, final int[] expected) {
        final int[] result = solution.twoSum(nums, target);
        Assert.assertNotNull(result);
        Assert.assertEquals(result.length, expected.length);
        for (int i = 0; i < result.length; i++) {
            Assert.assertEquals(result[i], expected[i]);
        }
    }
}
