package net.lliira.leetcode.r001;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P035InsertPosTest {
    private final P035InsertPos solution = new P035InsertPos();

    @Test
    public void tests() {
        test(new int[]{1,3,5,6}, 7, 4);
        test(new int[]{1,3,5,6}, 5, 2);
        test(new int[]{1,3,5,6}, 2, 1);
        test(new int[]{1,3,5,6}, 0, 0);
    }

    private void test(final int[] input, final int target, final int expected) {
        final int result = this.solution.searchInsert(input, target);
        Assert.assertEquals(result, expected);
    }
}