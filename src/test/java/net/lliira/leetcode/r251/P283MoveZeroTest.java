package net.lliira.leetcode.r251;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P283MoveZeroTest {
    private final P283MoveZero solution = new P283MoveZero();

    @Test
    public void tests() {
        test(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0});
    }

    private void test(final int[] input, final int[] expected) {
        this.solution.moveZeroes(input);
        assertEquals(input, expected);
    }
}