package net.lliira.leetcode;

import org.testng.Assert;

import java.util.*;

/**
 * Created by Jerric on 1/17/2017.
 */
public class TestHelper {

    public static ListNode link(final int... nums) {
        ListNode next = null;
        for (int i = nums.length - 1; i >= 0; i--) {
            final ListNode node = new ListNode(nums[i]);
            node.next = next;
            next = node;
        }
        return next;
    }

    public static <T> Set<T> set(final T... items) {
        final Set<T> set = new HashSet<T>(items.length);
        set.addAll(Arrays.asList(items));
        return set;
    }

    public static <T> List<T> list(final T... items) {
        final List<T> set = new ArrayList<T>(items.length);
        set.addAll(Arrays.asList(items));
        return set;
    }

    public static TreeNode tree(final int val) {
        return new TreeNode(val);
    }

    public static TreeNode tree(final int val, final TreeNode left, final TreeNode right) {
        final TreeNode node = new TreeNode(val);
        node.left = left;
        node.right = right;
        return node;
    }

    public static void assertEquals(ListNode actual, ListNode expected) {
        while (actual != null && expected != null ) {
            Assert.assertEquals(actual.val, expected.val);
            actual = actual.next;
            expected = expected.next;
        }
        Assert.assertTrue(actual == null && expected == null);
    }

    public static void assertEquals(int[] actual, int[] expected) {
        Assert.assertEquals(actual.length, expected.length);
        for (int i = 0; i < actual.length; i++) {
            Assert.assertEquals(actual[i], expected[i]);
        }
    }

    public static <T> void assertEquals(List<T> actual, List<T> expected) {
        Assert.assertEquals(actual.size(), expected.size());
        for (int i = 0; i < actual.size(); i++) {
            Assert.assertEquals(actual.get(i), expected.get(i));
        }
    }
}
