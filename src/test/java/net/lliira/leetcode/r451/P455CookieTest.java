package net.lliira.leetcode.r451;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P455CookieTest {
    private final P455Cookie solution = new P455Cookie();

    @Test
    public void tests() {
        test(new int[]{1,2,3}, new int[]{1, 1}, 1);
        test(new int[]{1,2}, new int[]{1, 2, 3}, 2);
    }

    private void test(final int[] input, final int[] cookies, final int expected) {
        final int result = this.solution.findContentChildren(input, cookies);
        Assert.assertEquals(result, expected);
    }
}