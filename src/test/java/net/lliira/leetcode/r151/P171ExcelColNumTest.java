package net.lliira.leetcode.r151;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P171ExcelColNumTest {
    private final P171ExcelColNum solution = new P171ExcelColNum();

    @Test
    public void tests() {
        test("A", 1);
        test("C", 3);
        test("Z", 26);
        test("AA", 27);
        test("AC", 29);
    }

    private void test(final String title, final int expected) {
        final int result = this.solution.titleToNumber(title);
        Assert.assertEquals(result, expected);
    }
}