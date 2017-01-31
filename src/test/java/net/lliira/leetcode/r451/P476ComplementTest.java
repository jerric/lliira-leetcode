package net.lliira.leetcode.r451;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P476ComplementTest {
    private final P476Complement solution = new P476Complement();

    @Test
    public void tests() {
        test(5, 2);
        test(1, 0);
    }

    private void test(final int input, final int expected) {
        final int result = this.solution.findComplement(input);
        Assert.assertEquals(result, expected);
    }
}