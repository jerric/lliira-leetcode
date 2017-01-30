package net.lliira.leetcode.r401;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P434SegmentsTest {
    private final P434Segments solution = new P434Segments();

    @Test
    public void tests() {
        test("    foo    bar", 2);
        test("Hello, my name is John", 5);
    }

    private void test(final String input, final int expected) {
        final int result = this.solution.countSegments(input);
        Assert.assertEquals(result, expected);
    }
}