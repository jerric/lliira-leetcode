package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P031NextPermutationTest {
    private final P031NextPermutation solution = new P031NextPermutation();

    @Test
    public void tests() {
        test(new int[]{2,3,1}, new int[]{3,1,2});
        test(new int[]{3,2,1}, new int[]{1,2,3});
        test(new int[]{1,1,5}, new int[]{1,5,1});
    }

    private void test(final int[] input, final int[] expected) {
        this.solution.nextPermutation(input);
        Assert.assertEquals(input, expected);
    }
}