package net.lliira.leetcode.r301;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P345RevertVowelsTest {
    private final P345RevertVowels solution = new P345RevertVowels();

    @Test
    public void tests() {
        test("hello", "holle");
        test("leetcode", "leotcede");
    }

    private void test(final String input, final String expected) {
        final String result = this.solution.reverseVowels(input);
        Assert.assertEquals(result, expected);
    }
}