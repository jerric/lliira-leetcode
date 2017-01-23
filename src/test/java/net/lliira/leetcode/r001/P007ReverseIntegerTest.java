package net.lliira.leetcode.r001;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/1/2017.
 */
public class P007ReverseIntegerTest {

    private final P007ReverseInteger solution = new P007ReverseInteger();

    @Test
    public void testCase() {
        test(123, 321);
        test(-123, -321);
        test(100, 1);
        test(-100, -1);
        test(1000000003 , 0);
    }

    private void test(final int x, final int expected) {
        final int result = this.solution.reverse(x);
        Assert.assertEquals(result, expected);
    }
}
