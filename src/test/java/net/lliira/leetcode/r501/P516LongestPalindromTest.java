package net.lliira.leetcode.r501;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P516LongestPalindromTest {
    private final P516LongestPalindrom solution = new P516LongestPalindrom();

    @Test
    public void tests() {
        test("bbbab", 4);
        test("cbbd", 2);
    }

    private void test(final String input, final int expected) {
        final int result = this.solution.longestPalindromeSubseq(input);
        Assert.assertEquals(result, expected);
    }
}