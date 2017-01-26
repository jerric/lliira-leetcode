package net.lliira.leetcode.r151;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P189RotateArrayTest {
    private final P189RotateArray solution = new P189RotateArray();

    @Test
    public void tests() {
        test(new int[]{1,2,3,4,5,6,7}, 3, new int[]{5,6,7,1,2,3,4});
    }

    private void test(final int[] array, final int k, final int[] expected) {
        this.solution.rotate(array, k);
        assertEquals(array, expected);
    }
}