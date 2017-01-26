package net.lliira.leetcode.r201;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P203RemoveItemTest {
    private final P203RemoveItem solution = new P203RemoveItem();

    @Test
    public void tests() {
        test(link(1, 2, 6, 3, 4, 5, 6), 6, link(1, 2, 3, 4, 5));
    }

    private void test(final ListNode a, final int val, final ListNode expected) {
        final ListNode result = this.solution.removeElements(a, val);
        assertEquals(result, expected);
    }
}