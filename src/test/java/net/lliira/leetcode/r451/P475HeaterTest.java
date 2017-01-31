package net.lliira.leetcode.r451;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P475HeaterTest {
    private final P475Heater solution = new P475Heater();

    @Test
    public void tests() {
        test(new int[]{1,2,3}, new int[]{2}, 1);
        test(new int[]{1,2,3,4}, new int[]{1, 4}, 1);
    }

    private void test(final int[] input, final int[] radius, final int expected) {
        final int result = this.solution.findRadius(input, radius);
        Assert.assertEquals(result, expected);
    }
}