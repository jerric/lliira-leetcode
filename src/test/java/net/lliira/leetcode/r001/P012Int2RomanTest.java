package net.lliira.leetcode.r001;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/16/2017.
 */
public class P012Int2RomanTest {

    private final P012Int2Roman solution = new P012Int2Roman();

    @Test
    public void testCase() {

    }
    private void test(final int num, final String expected) {
        final String result = this.solution.intToRoman(num);
        Assert.assertEquals(result, expected);
    }
}
