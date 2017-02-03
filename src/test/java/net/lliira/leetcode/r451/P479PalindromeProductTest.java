package net.lliira.leetcode.r451;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P479PalindromeProductTest {
    private final P479PalindromeProduct solution = new P479PalindromeProduct();

    @Test
    public void tests() {
        test(6, 1218);
        test(5, 677);
        test(2, 987);
        test(1, 9);
    }

    private void test(final int input, final int expected) {
        final int result = this.solution.largestPalindrome(input);
        Assert.assertEquals(result, expected);
    }
}