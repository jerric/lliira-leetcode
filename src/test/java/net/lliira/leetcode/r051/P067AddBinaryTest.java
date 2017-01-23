package net.lliira.leetcode.r051;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/23/2017.
 */
public class P067AddBinaryTest {
    private final P067AddBinary solution = new P067AddBinary();

    @Test
    public void tests() {
        test("11", "1", "100");
    }
    private void test(final String a, final String b, final String expected) {
        final String result = this.solution.addBinary(a, b);
        Assert.assertEquals(result, expected);
    }
}
