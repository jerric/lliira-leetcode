package net.lliira.leetcode;

import org.testng.annotations.Test;

import static net.lliira.leetcode.TestHelper.*;
/**
 * Created by Jerric on 1/19/2017.
 */
public class P023MergeKListTest {

    private final P023MergeKList solution = new P023MergeKList();

    @Test
    public void tests() {
        test(new ListNode[]{ link(1, 3, 5), link(2, 4)}, link(1, 2, 3, 4, 5));
    }

    private void test(final ListNode[] lists, final ListNode expected) {
        final ListNode result = this.solution.mergeKLists(lists);
        assertEquals(result, expected);
    }
}
