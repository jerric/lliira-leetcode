package net.lliira.leetcode.r451;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P459RepeatPatternTest {
    private final P459RepeatPattern solution = new P459RepeatPattern();

    @Test
    public void tests() {
        test("aa", true);
        test("abab", true);
        test("aba", false);
        test("abcabcabcabc", true);
    }

    private void test(final String input, final boolean expected) {
        final boolean result = this.solution.repeatedSubstringPattern(input);
        Assert.assertEquals(result, expected);
    }
}