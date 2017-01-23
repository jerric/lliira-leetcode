package net.lliira.leetcode.r001;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jerric on 1/22/2017.
 */
public class P038CountSayTest {
    private final P038CountSay solution = new P038CountSay();

    @Test
    public void tests() {
        test(1, "1");
        test(2, "11");
        test(3, "21");
        test(4, "1211");
        test(5, "111221");
        test(6, "312211");
    }

    private void test(final int n, final String expected) {
        final String result = this.solution.countAndSay(n);
        Assert.assertEquals(result, expected);
    }
}
