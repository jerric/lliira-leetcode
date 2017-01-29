package net.lliira.leetcode.r351;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P389FindDiffTest {
    private final P389FindDiff solution = new P389FindDiff();

    @Test
    public void tests() {
        test("abcd", "abecd", 'e');
    }

    private void test(final String input, final String mutate, final char expected) {
        final char result = this.solution.findTheDifference(input, mutate);
        Assert.assertEquals(result, expected);
    }
}