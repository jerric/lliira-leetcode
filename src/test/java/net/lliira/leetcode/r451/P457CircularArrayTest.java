package net.lliira.leetcode.r451;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P457CircularArrayTest {
    private final P457CircularArray solution = new P457CircularArray();

    @Test
    public void tests() {
        test(new int[]{-1,-2, -3, -4, -5}, false);
        test(new int[]{3, 1, 2}, true);
        test(new int[]{-2, 1, -1, -2, -2}, false);
        test(new int[]{2, -1, 1, 2, 2}, true);
        test(new int[]{-1, 2}, false);
    }

    private void test(final int[] input, final boolean expected) {
        final boolean result = this.solution.circularArrayLoop(input);
        Assert.assertEquals(result, expected);
    }
}