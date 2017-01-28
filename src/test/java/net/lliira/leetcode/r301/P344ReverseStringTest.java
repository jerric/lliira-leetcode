package net.lliira.leetcode.r301;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P344ReverseStringTest {
    private final P344ReverseString solution = new P344ReverseString();

    @Test
    public void tests() {
        test("hello", "olleh");
    }

    private void test(final String input, final String expected) {
        final String result = this.solution.reverseString(input);
        Assert.assertEquals(result, expected);
    }
}