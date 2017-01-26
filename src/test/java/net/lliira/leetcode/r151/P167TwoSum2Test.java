package net.lliira.leetcode.r151;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P167TwoSum2Test {
    private final P167TwoSum2 sol = new P167TwoSum2();

    @Test
    public void tests() {
        test(new int[]{2, 7, 11, 15 }, 9, new int[]{1, 2});
    }

    private void test(final int[] numbers, final int target, final int[] expected) {
        final int[] result = this.sol.twoSum(numbers, target);
        Assert.assertEquals(result, expected);
    }
}
