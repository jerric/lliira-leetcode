package net.lliira.leetcode.r401;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P405HexTest {
    private final P405Hex solution = new P405Hex();

    @Test
    public void tests() {
        test(26, "1a");
        test(-1, "ffffffff");
    }

    private void test(final int input, final String expected) {
        final String result = this.solution.toHex(input);
        Assert.assertEquals(result, expected);
    }
}