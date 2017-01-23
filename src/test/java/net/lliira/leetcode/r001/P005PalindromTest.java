package net.lliira.leetcode.r001;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jerric on 12/29/2016.
 */
public class P005PalindromTest {

    private final P005Palindrom solution = new P005Palindrom();

    @Test
    public void testCase() {
        test("a", "a");
        test("babad", "bab", "aba");
        test("cbbd", "bb");
    }

    private void test(final String s, final String... expected) {
        final String result = this.solution.longestPalindrome(s);
        final Set<String> set = new HashSet<>(Arrays.asList(expected));
        Assert.assertTrue(set.contains(result));
    }
}
