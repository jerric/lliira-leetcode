package net.lliira.leetcode.r001;

import org.testng.Assert;
import org.testng.annotations.Test;

public class P043MultiplyStringsTest {
    private final P043MultiplyStrings solution = new P043MultiplyStrings();

    @Test
    public void tests() {
        test("999", "999", "998001");
        test("0", "100", "0");
        test("12", "21", "252");
    }

    private void test(final String input, final String b, final String expected) {
        final String result = this.solution.multiply(input, b);
        Assert.assertEquals(result, expected);
    }
}