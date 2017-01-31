package net.lliira.leetcode.r451;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P492RectangleTest {
    private final P492Rectangle solution = new P492Rectangle();

    @Test
    public void tests() {
        test(4, new int[]{2,2});
    }

    private void test(final int input, final int[] expected) {
        final int[] result = this.solution.constructRectangle(input);
        assertEquals(result, expected);
    }
}