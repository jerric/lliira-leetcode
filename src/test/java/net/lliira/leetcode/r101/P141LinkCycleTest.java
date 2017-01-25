package net.lliira.leetcode.r101;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P141LinkCycleTest {
    private final P141LinkCycle s = new P141LinkCycle();

    @Test
    public void t() {
        t(link(1), false);
        final ListNode node = new ListNode(1);
        node.next = node;
        t(node, true);
    }

    private void t(final ListNode head, final boolean e) {
        final boolean r = this.s.hasCycle(head);
        Assert.assertEquals(r, e);
    }
}
