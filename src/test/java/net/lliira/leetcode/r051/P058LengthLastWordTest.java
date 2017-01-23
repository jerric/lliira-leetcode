package net.lliira.leetcode.r051;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/22/2017.
 */
public class P058LengthLastWordTest {
    private final P058LengthLastWord solution = new P058LengthLastWord();

    @Test
    public void tests() {
        test("a", 1);
        test("a ", 1);
        test("Hello World", 5);
    }

    private void test(final String s, final int expected) {
        final int result = this.solution.lengthOfLastWord(s);
        Assert.assertEquals(result, expected);
    }
}
