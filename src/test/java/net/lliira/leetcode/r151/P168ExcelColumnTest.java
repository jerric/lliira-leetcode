package net.lliira.leetcode.r151;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P168ExcelColumnTest {
    private final P168ExcelColumn sol = new P168ExcelColumn();

    @Test
    public void tests() {
        test(3, "C");
        test(26, "Z");
        test(28, "AB");
    }

    private void test(final int n, final String expect) {
        final String result = this.sol.convertToTitle(n);
        Assert.assertEquals(result, expect);
    }
}
