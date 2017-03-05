package net.lliira.leetcode.r051;

import net.lliira.leetcode.ListNode;
import net.lliira.leetcode.r051.P060PermutationSequence;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P060PermutationSequenceTest {
    private final P060PermutationSequence solution = new P060PermutationSequence();

    @Test
    public void tests() {
        test(3, 1, "123");
        test(var2, exp2);
    }

    private void test(final int input, final int k, final String expected) {
        final String result = this.solution.getPermutation(input, k);
        Assert.assertEquals(result, expected);
    }
}