package net.lliira.leetcode.r501;

import net.lliira.leetcode.ListNode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

public class P503NextGreaterElementTest {
    private final P503NextGreaterElement solution = new P503NextGreaterElement();

    @Test
    public void tests() {
        test(new int[]{1,2,1}, new int[]{2, -1, 2});
        test(new int[]{2, 1}, new int[]{-1, 2});
    }

    private void test(final int[] input, final int[] expected) {
        final int[] result = this.solution.nextGreaterElements(input);
        assertEquals(result, expected);
    }
}