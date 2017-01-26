package net.lliira.leetcode.r201;

import net.lliira.leetcode.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;

/**
 * Created by Jerric on 1/25/2017.
 */
public class P206ReverseListTest {
    private final P206ReverseList solution = new P206ReverseList();

    @Test
    public void tests() {
        test(link(1, 2, 3), link(3, 2, 1));
    }

    private void test(final ListNode a, final ListNode expected) {
        final ListNode result = this.solution.reverseList(a);
        assertEquals(result, expected);
    }
}