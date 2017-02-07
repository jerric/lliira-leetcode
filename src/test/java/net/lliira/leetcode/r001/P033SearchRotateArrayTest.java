package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P033SearchRotateArrayTest {
    private final P033SearchRotateArray solution = new P033SearchRotateArray();

    @Test
    public void tests() {
        test(new int[]{4, 5, 6, 7, 0, 1, 2, 3}, 7, 3);
        test(new int[]{4, 5, 6, 7, 0, 1, 2, 3}, -1, -1);
    }

    private void test(final int[] input, final int target, final int expected) {
        final int result = this.solution.search(input, target);
        Assert.assertEquals(result, expected);
    }
}