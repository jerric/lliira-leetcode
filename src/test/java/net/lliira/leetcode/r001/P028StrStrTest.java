package net.lliira.leetcode.r001;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by jerricg on 1/19/17.
 */
public class P028StrStrTest {
    private final P028StrStr solution = new P028StrStr();

    @Test
    public void tests() {
        test("a", "a", 1);
        test("aba", "ba", 1);
        test("abcabde", "abd", 3);
    }

    private void test(final String haystack, final String needle, final int expected) {
        final int result = this.solution.strStr(haystack, needle);
        Assert.assertEquals(result, expected);
    }
}
