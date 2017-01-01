package net.lliira.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

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
        final ListNode l = create(left), r = create(right);
        ListNode e = create(expected);
        ListNode result = solution.addTwoNumbers(l, r);
        while (result != null && e != null ) {
            Assert.assertEquals(result.val, e.val);
            result = result.next;
            e = e.next;
        }
        Assert.assertTrue(result == null && e == null);
    }

    private ListNode create(final int[] digits) {
        ListNode next = null;
        for (int i = digits.length - 1; i >= 0; i--) {
            final ListNode node = new ListNode(digits[i]);
            node.next = next;
            next = node;
        }
        return next;
    }
}
