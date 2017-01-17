package net.lliira.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/1/2017.
 */
public class P010RegexTest {

    private final P010Regex solution = new P010Regex();

    @Test
    public void testCase() {
        test("bbab","b*a*", false);
        test("aaaaaaaaaaaaab","a*a*a*a*a*a*a*a*a*a*a*a*b", true);
        test("","", true);
        test("",".*", true);
        test("bbbba",".*a*a", true);
        test("a","ab*", true);
        test("aaa","ab*ac*a", true);
        test("aa","a", false);
        test("abcd","*", false);
        test("aa","aa", true);
        test("aaa","aa", false);
        test("aa", "a*", true);
        test("aa", ".*", true);
        test("ab", ".*", true);
        test("aab", "c*a*b", true);
    }

    private void test(final String s, final String p, final boolean expected) {
        final boolean result = this.solution.isMatch(s, p);
        Assert.assertEquals(result, expected);
    }
}
