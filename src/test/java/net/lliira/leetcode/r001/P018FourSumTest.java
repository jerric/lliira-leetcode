package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P018FourSumTest {
    private final P018FourSum solution = new P018FourSum();

    @Test
    public void tests() {
        test(new int[]{1, 0, -1, 0, -2, 2}, 0, list(list(-1,  0, 0, 1), list(-2, -1, 1, 2), list(-2,  0, 0, 2)));
    }

    private void test(final int[] input, final int target, final List<List<Integer>> expected) {
        final List<List<Integer>> result = this.solution.fourSum(input, target);
        Assert.assertEquals(result, expected);
    }
}