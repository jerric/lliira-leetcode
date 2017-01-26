package net.lliira.leetcode.r151;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P160ListIntersectTest {
    private final P160ListIntersect solution = new P160ListIntersect();

    @Test
    public void tests() {
        final ListNode a = link(1, 2), b = link(3, 4, 5), c = link(6, 7, 8);
        a.next.next = c;
        b.next.next.next = c;
        test(a, b, c);
        test(link(1, 2, 3),link(4, 5), null);
    }

    private void test(final ListNode a, final ListNode b, final ListNode e) {
        final ListNode result = this.solution.getIntersectionNode(a, b);
        Assert.assertEquals(result, e);
    }
}
