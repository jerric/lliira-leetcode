package net.lliira.leetcode.r301;

import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.assertEquals;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P350ArrayIntersect2Test {
    private final P350ArrayIntersect2 solution = new P350ArrayIntersect2();

    @Test
    public void tests() {
        test(new int[]{1, 2, 2, 1}, new int[]{2, 2}, new int[]{2, 2});
    }

    private void test(final int[] input, final int[] input2, final int[] expected) {
        final int result[] = this.solution.intersection(input, input2);
        assertEquals(result, expected);
    }
}