package net.lliira.leetcode.r251;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P290WordPatternTest {
    private final P290WordPattern solution = new P290WordPattern();

    @Test
    public void tests() {
        test("abba", "dog cat cat dog", true);
        test("abba", "dog cat cat fish", false);
        test("aaaa", "dog cat cat dog", false);
        test("abba", "dog dog dog dog", false);
    }

    private void test(final String pattern, final  String str, final boolean expected) {
        final boolean result = this.solution.wordPattern(pattern, str);
        Assert.assertEquals(result, expected);
    }
}