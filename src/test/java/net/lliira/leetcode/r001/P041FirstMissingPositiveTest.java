package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P041FirstMissingPositiveTest {
    private final P041FirstMissingPositive solution = new P041FirstMissingPositive();

    @Test
    public void tests() {
        test(new int[]{1,2,0}, 3);
        test(new int[]{3,4,-1,1}, 2);
    }

    private void test(final int[] input, final int expected) {
        final int result = this.solution.firstMissingPositive(input);
        Assert.assertEquals(result, expected);
    }
}