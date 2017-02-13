package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 isMatch("aa","a") → false
 isMatch("aa","aa") → true
 isMatch("aaa","aa") → false
 isMatch("aa", "*") → true
 isMatch("aa", "a*") → true
 isMatch("ab", "?*") → true
 isMatch("aab", "c*a*b") → false

 */
public class P044WildcardMatchingTest {
    private final P044WildcardMatching solution = new P044WildcardMatching();

    @Test
    public void tests() {
        test("aa","a", false);
        test("aa","aa", true);
        test("aaa","aa", false);
        test("aa", "*", true);
        test("aa", "a*", true);
        test("ab", "?*", true);
        test("aab", "c*a*b", false);
    }

    private void test(final String input, final String pattern, final boolean expected) {
        final boolean result = this.solution.isMatch(input, pattern);
        Assert.assertEquals(result, expected);
    }
}