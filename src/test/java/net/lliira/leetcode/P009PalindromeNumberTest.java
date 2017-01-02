package net.lliira.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/1/2017.
 */
public class P009PalindromeNumberTest {

    private final P009PalindromeNumber solution = new P009PalindromeNumber();

    @Test
    public void testCase() {
        test(123, false);
        test(121, true);
        test(1, true);
        test(11, true);
        test(12, false);
        test(-121, true);
        test(-23, false);
    }

    private void test(final int n, final boolean expected) {
        final boolean result = this.solution.isPalindrome(n);
        Assert.assertEquals(result, expected);
    }
}
