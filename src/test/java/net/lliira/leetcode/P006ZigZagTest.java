package net.lliira.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 12/31/2016.
 */
public class P006ZigZagTest {

    private final P006ZigZag solution = new P006ZigZag();

    @Test
    public void testCase() {
        test("abc", 2, "acb");
        test("abcd", 2, "acbd");
        test("abcd", 3, "abdc");
        test("abcde", 4, "abced");
        test("PAYPALISHIRING", 3, "PAHNAPLSIIGYIR");
    }

    private void test(final String s, final int numRows, final String expected) {
        final String result = this.solution.convert(s, numRows);
        Assert.assertEquals(result, expected);
    }
}