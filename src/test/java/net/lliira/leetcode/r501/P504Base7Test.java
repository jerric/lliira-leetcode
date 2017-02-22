package net.lliira.leetcode.r501;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P504Base7Test {
    private final P504Base7 solution = new P504Base7();

    @Test
    public void tests() {
        test(100, "202");
        test(-7, "-10");
    }

    private void test(final int input, final String expected) {
        final String result = this.solution.convertToBase7(input);
        Assert.assertEquals(result, expected);
    }
}