package net.lliira.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/16/2017.
 */
public class P013Roman2IntTest {

    private final P013Roman2Int solution = new P013Roman2Int();

    @Test
    public void testCase() {
        test("IV", 4);
        test("XIII", 13);
        test("LXXVIII", 78);
    }

    private void test(final String roman, final int expected) {
        final int result = this.solution.romanToInt(roman);
        Assert.assertEquals(result, expected);
    }
}
