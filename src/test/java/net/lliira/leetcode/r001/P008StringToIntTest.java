package net.lliira.leetcode.r001;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/1/2017.
 */
public class P008StringToIntTest {

    private final P008StringToInt solution = new P008StringToInt();

    @Test
    public void testCase() {
        test("123", 123);
        test("+123", 123);
        test("-123", -123);
        test("   123", 123);
        test("    ", 0);
        test("123bas", 123);
        test("iuq123", 0);
        test("1023298928322232", Integer.MAX_VALUE);
        test("-1023298928322232", Integer.MIN_VALUE);
    }

    private void test(final String str, final int expected) {
        final int result = this.solution.myAtoi(str);
        Assert.assertEquals(result, expected);
    }
}
