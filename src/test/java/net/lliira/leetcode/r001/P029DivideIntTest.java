package net.lliira.leetcode.r001;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/20/2017.
 */
public class P029DivideIntTest {
    private final P029DivideInt solution = new P029DivideInt();

    @Test
    public void tests() {
        test(Integer.MIN_VALUE, -1, Integer.MAX_VALUE);
        test(5, 3, 1);
    }
    private void test(final int divident, final int divider, final int expected) {
        final int result = this.solution.divide(divident, divider);
        Assert.assertEquals(result, expected);
    }
}
