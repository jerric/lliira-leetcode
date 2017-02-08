package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P034SearchRangeTest {
    private final P034SearchRange solution = new P034SearchRange();

    @Test
    public void tests() {
        test(new int[]{1}, 2, new int[]{-1, -1});
        test(new int[]{1}, 1, new int[]{0, 0});
        test(new int[]{5, 7, 7, 8, 8, 10}, 8, new int[]{3, 4});
        test(new int[]{5, 7, 7, 8, 8, 10}, 9, new int[]{-1, -1});
    }

    private void test(final int[] input, final int target, final int[] expected) {
        final int[] result = this.solution.searchRange(input, target);
        assertEquals(result, expected);
    }
}