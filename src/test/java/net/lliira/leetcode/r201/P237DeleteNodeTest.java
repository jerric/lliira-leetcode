package net.lliira.leetcode.r201;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P237DeleteNodeTest {
    private final P237DeleteNode solution = new P237DeleteNode();

    @Test
    public void tests() {
        test(link(1, 2, 3, 4));
    }

    private void test(final ListNode input) {
        ListNode next = input.next;
        this.solution.deleteNode(input);
        Assert.assertEquals(input.next, next.next);
        Assert.assertEquals(input.val, next.val);
    }
}