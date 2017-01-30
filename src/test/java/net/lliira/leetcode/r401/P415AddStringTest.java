package net.lliira.leetcode.r401;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P415AddStringTest {
    private final P415AddString solution = new P415AddString();

    @Test
    public void tests() {
        test("1234", "678", "1912");
    }

    private void test(final String input, final String b, final String expected) {
        final String result = this.solution.addStrings(input, b);
        Assert.assertEquals(result, expected);
    }
}