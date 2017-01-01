package net.lliira.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 12/29/2016.
 */
public class P003LongestSubstringTest {

    private final P003LongestSubstring solution = new P003LongestSubstring();

    @Test
    public void testCase1() {
        test("c", 1);
        test("abcabcbb", 3);
        test("bbbbb", 1);
        test("pwwkew", 3);
    }

    private void test(final String s, final int expected) {
        final int result = solution.lengthOfLongestSubstring(s);
        Assert.assertEquals(result, expected);
    }
}
