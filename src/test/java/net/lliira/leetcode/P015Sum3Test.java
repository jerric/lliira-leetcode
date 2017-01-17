package net.lliira.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jerric on 1/16/2017.
 */
public class P015Sum3Test {
    private P015Sum3 solution = new P015Sum3();

    @Test
    public void tests() {
        test(new int[]{-1, 0, 1, 2, -1, -4}, Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1)));
        test(new int[]{0, 0, 0}, Arrays.asList(Arrays.asList(0, 0, 0)));
    }

    private void test(final int[] nums, final List<List<Integer>> expected) {
        final List<List<Integer>> results = this.solution.threeSum(nums);
        Assert.assertEquals(results.size(), expected.size());
        for (int i = 0; i < results.size(); i++) {
            final List<Integer> r = results.get(i);
            final List<Integer> e = expected.get(i);
            Assert.assertEquals(r.size(), e.size());
            for (int j = 0; j < r.size(); j++) {
                Assert.assertEquals(r.get(j), e.get(j));
            }
        }
    }
}
