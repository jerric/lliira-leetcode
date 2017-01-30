package net.lliira.leetcode.r401;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P409LongestPalindromTest {
    private final P409LongestPalindrom solution = new P409LongestPalindrom();

    @Test
    public void tests() {
        test("abccccdd", 7);
    }

    private void test(final String input, final int expected) {
        final int result = this.solution.longestPalindrome(input);
        Assert.assertEquals(result, expected);
    }
}