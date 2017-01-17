package net.lliira.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/16/2017.
 */
public class P014LongestCommonPrefixTest {

    private final P014LongestCommonPrefix solution = new P014LongestCommonPrefix();

    @Test
    public void testCase() {
        test("ab", "absdsd", "abcd");
    }

    private void test(final String expected, final String... strs) {
        final String result = this.solution.longestCommonPrefix(strs);
        Assert.assertEquals(result, expected);
    }
}
