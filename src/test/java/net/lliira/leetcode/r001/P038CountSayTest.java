package net.lliira.leetcode.r001;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 The count-and-say sequence is the sequence of integers beginning as follows:
 1, 11, 21, 1211, 111221, ...

 1 is read off as "one 1" or 11.
 11 is read off as "two 1s" or 21.
 21 is read off as "one 2, then one 1" or 1211.
 Given an integer n, generate the nth sequence.

 Note: The sequence of integers will be represented as a string.
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
