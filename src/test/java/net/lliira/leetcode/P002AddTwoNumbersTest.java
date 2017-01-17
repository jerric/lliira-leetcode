package net.lliira.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;
import static net.lliira.leetcode.TestHelper.*;

import java.util.List;

/**
 * Created by Jerric on 12/28/2016.
 */
public class P002AddTwoNumbersTest {

    private final P002AddTwoNumbers solution = new P002AddTwoNumbers();
    @Test
    public void testCase1() {
        test(new int[]{2, 4, 3}, new int[]{5, 6, 4}, new int[]{7, 0, 8});
    }

    private void test(final int[] left, final int[] right, final int[] expected) {
        final ListNode l = list(left), r = list(right);
        ListNode e = list(expected);
        ListNode result = solution.addTwoNumbers(l, r);
        assertEquals(result, e);
    }
}
