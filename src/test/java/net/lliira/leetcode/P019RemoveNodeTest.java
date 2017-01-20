package net.lliira.leetcode;

import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/17/2017.
 */
public class P019RemoveNodeTest {
    private static P019RemoveNode solution = new P019RemoveNode();

    @Test
    public void tests() {
        test(link(1, 2, 3, 4, 5), 2, link(1, 2, 3, 5));
    }

    private void test(final ListNode head, final int n, final ListNode expected) {
        final ListNode result = this.solution.removeNthFromEnd(head, n);
        assertEquals(result, expected);
    }
}
