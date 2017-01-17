package net.lliira.leetcode;

import org.testng.Assert;

import java.util.List;

/**
 * Created by Jerric on 1/17/2017.
 */
public class TestHelper {

    public static ListNode list(final int... nums) {
        ListNode next = null;
        for (int i = nums.length - 1; i >= 0; i--) {
            final ListNode node = new ListNode(nums[i]);
            node.next = next;
            next = node;
        }
        return next;
    }

    public static void assertEquals(ListNode actual, ListNode expected) {
        while (actual != null && expected != null ) {
            Assert.assertEquals(actual.val, expected.val);
            actual = actual.next;
            expected = expected.next;
        }
        Assert.assertTrue(actual == null && expected == null);
    }
}
